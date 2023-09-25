package com.morgan.iterone.controller;

import com.morgan.iterone.mapper.AccountMapper;
import com.morgan.iterone.mapper.GameMapper;
import com.morgan.iterone.mapper.StoreMapper;
import com.morgan.iterone.mapper.VersionMapper;
import com.morgan.iterone.pojo.Game;
import com.morgan.iterone.pojo.GameVersion;
import com.morgan.iterone.pojo.Store;
import com.morgan.iterone.pojo.Version;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class StoreController {

    @Autowired
    private StoreMapper storeMapper;
    private VersionMapper versionMapper;
    private AccountMapper accountMapper;
    private GameMapper gameMapper;
    @RequestMapping("/storeLoad")
    public String loadStores(Model model) {
        List<Store> storeList = storeMapper.queryStoreList();
        System.out.println(storeList);
        model.addAttribute("storeList", storeList);
        return "storeList";
    }

    @RequestMapping("/storeDetail")
    public String detailStore(Model model, HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Store thisStore = storeMapper.queryStoreById(id);
        model.addAttribute("store", thisStore);
        return "store-details";
    }

    @RequestMapping("/storeSearch")
    public String searchStores(@RequestParam("search") String search, Model model) {
        search = '%' + search + '%';
        List<Store> storeList = storeMapper.queryStoreSearch(search);
        model.addAttribute("storeList", storeList);
        return "storeList";
    }

    @RequestMapping("/storeFilter")
    public String filterStores(HttpServletRequest request, Model model) {
        String verID = request.getParameter("verID");
        String userID = request.getParameter("userID");
        List<Store> storeListByVerID = storeMapper.queryStoreByVerID(verID);
        List<Store> storeListByUserID = storeMapper.queryStoreByUserID(userID);
        model.addAttribute("storeListByVerID", storeListByVerID);
        model.addAttribute("storeListByUserID", storeListByUserID);
        return "storeList";
    }
    @RequestMapping("/store/{gameId}")
    public String getGameDetail(@PathVariable("gameId") int gameId, Model model) {
        Game game = gameMapper.queryGameByGameID(gameId);
        List<Version> versions = versionMapper.queryVersionByGameID(gameId);
        model.addAttribute("game", game);
        model.addAttribute("versions", versions);
        return "storeDetail";
    }


}
