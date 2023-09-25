package com.morgan.iterone.controller;

import com.morgan.iterone.mapper.GameMapper;
import com.morgan.iterone.pojo.Game;
import com.morgan.iterone.pojo.GameVersion;
import com.morgan.iterone.pojo.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {
    GameMapper gameMapper;
    GameController gameController;
    @GetMapping("/")
    public String index(Model model) {
        List<Game> gameList = gameMapper.queryGameList();
        List<GameVersion> gameVersionList = gameController.getGameVersions(gameList);
        model.addAttribute("gameVersionList",gameVersionList);
        return "index";
    }

    @Autowired
    public MainController(GameMapper gameMapper, GameController gameController) {
        this.gameMapper = gameMapper;
        this.gameController = gameController;
    }



}

