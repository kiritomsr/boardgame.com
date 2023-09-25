package com.morgan.iterone.controller;


import com.morgan.iterone.mapper.CollMapper;
import com.morgan.iterone.mapper.ItemMapper;
import com.morgan.iterone.mapper.ReviewMapper;
import com.morgan.iterone.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CollController {

    @Autowired
    private CollMapper collMapper;

    @Autowired
    private ItemMapper itemMapper;

    @GetMapping(value = "/collectionLoad")
    public String loadCollection(Model model) {
        List<Coll> collList = collMapper.queryCollectionList();
        model.addAttribute("collList", collList);
        return "collectionList";
    }

    @GetMapping(value = "/collectionDetail")
    public String detailCollection(Model model, HttpServletRequest request) {
        System.out.println("Coo");
        int id = Integer.parseInt(request.getParameter("collectID"));
        Coll thisColl = collMapper.queryCollectionById(id);
        model.addAttribute("collect",thisColl);
        List<Item> items = itemMapper.queryItemByCollectID(id);
        model.addAttribute("itemsList", items);
        return "collectionList";
    }

    public CollController(ItemMapper itemMapper) {
        this.itemMapper = itemMapper;
    }

}
