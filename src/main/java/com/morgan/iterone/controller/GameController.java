package com.morgan.iterone.controller;


import com.morgan.iterone.mapper.AccountMapper;
import com.morgan.iterone.mapper.GameMapper;
import com.morgan.iterone.mapper.ReviewMapper;
import com.morgan.iterone.mapper.VersionMapper;
import com.morgan.iterone.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class GameController {

    @Autowired
    private GameMapper gameMapper;
    @Autowired
    private VersionMapper versionMapper;
    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private AccountMapper accountMapper;

    public List<GameVersion> getGameVersions(List<Game> games){
        List<GameVersion> gameVersions = new ArrayList<>();
        for (Game game: games){
            gameVersions.addAll(getGameVersion(game));
        }
        return gameVersions;
    }

    public List<Reviewun> getReviewuns(List<Review> reviews){
        List<Reviewun> reviewuns = new ArrayList<>();
        for (Review review: reviews){
            int uid = review.getUserID();
            Account account = accountMapper.queryByUserID(uid);
//            System.out.println(account);
            String usn = account.getUsername();
            reviewuns.add(new Reviewun(review, usn));
        }
        return reviewuns;
    }

    public Reviews getReviewsByVid(int vid){
        Reviews thisReviews = reviewMapper.queryReviewsByVerID(vid);
        if(thisReviews==null) thisReviews = new Reviews(vid, 0, 0);
//        System.out.println(thisReviews.toString());
        return thisReviews;
    }

    public List<GameVersion> getGameVersion(Game game){
        List<Version> versionList = versionMapper.queryVersionByGameID(game.getGameID());

        List<GameVersion> gameVersions = new ArrayList<>();
        for (Version version:versionList)  {
//            Reviews thisReviews = reviewMapper.queryReviewsByVerID(version.getVerID());
            Reviews thisReviews = getReviewsByVid(version.getVerID());

            gameVersions.add(new GameVersion(game, version, thisReviews));
        }
        return gameVersions;
    }

    @RequestMapping("/gameLoad")
    public String loadGame(Model model){

        List<Game> gameList = gameMapper.queryGameList();
        List<GameVersion> gameVersionList = getGameVersions(gameList);

        model.addAttribute("gameVersionList",gameVersionList);
        model.addAttribute("cates",getEnums("category"));
        model.addAttribute("genres",getEnums("genre"));

        return "gameList";
    }

    @RequestMapping("/gameDetail")
    public String detailGame(Model model, HttpServletRequest request){

        int vid = Integer.parseInt(request.getParameter("vid"));
        Version thisVersion = versionMapper.queryVersionByVerID(vid);
        Game thisGame = gameMapper.queryGameByGameID(thisVersion.getGameID());
        Reviews thisReviews = reviewMapper.queryReviewsByVerID(thisVersion.getVerID());
        GameVersion gameVersion = new GameVersion(thisGame, thisVersion, thisReviews);
        model.addAttribute("gv",gameVersion);
        model.addAttribute("pics", Arrays.asList(1, 2, 3, 4, 5));

        List<Review> reviewList = reviewMapper.queryReviewByVerID(thisVersion.getVerID());
        List<Reviewun> reviewuns = getReviewuns(reviewList);
        model.addAttribute("reviewuns", reviewuns);

        return "game-details";
    }

    @RequestMapping("/gameSearch")
    public String searchGames(@RequestParam("search") String search,
                              Model model){
        search = '%' + search + '%';

        List<Game> gameList = gameMapper.queryGameSearch(search);
        List<GameVersion> gameVersionList = getGameVersions(gameList);

        model.addAttribute("gameVersionList",gameVersionList);
        model.addAttribute("cates",getEnums("category"));
        model.addAttribute("genres",getEnums("genre"));

        return "gameList";
    }

    @RequestMapping("/gameFilter")
    public String filterGames(HttpServletRequest request,
                              Model model){

        String category = request.getParameter("category");
        String genre = request.getParameter("genre");

        List<Game> gameList = gameMapper.queryGameSearch(category);
        List<GameVersion> gameVersionList = getGameVersions(gameList);

        model.addAttribute("gameVersionList",gameVersionList);
        model.addAttribute("cates",getEnums("category"));
        model.addAttribute("genres",getEnums("genre"));

        return "gameList";
    }

    public List<Enumeration> getEnums(String etype){
        return gameMapper.queryEnumeration(etype);
    }

    public GameController(ReviewMapper reviewMapper) {
        this.reviewMapper = reviewMapper;
    }
}
