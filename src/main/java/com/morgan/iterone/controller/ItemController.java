package com.morgan.iterone.controller;

import com.morgan.iterone.mapper.ItemMapper;
import com.morgan.iterone.pojo.Item;
import com.morgan.iterone.pojo.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemMapper itemMapper;

    @GetMapping("/")
    public String loadItems(Model model) {
        List<Item> itemList = itemMapper.queryItemList();
        model.addAttribute("itemList", itemList);
        return "collectionList";
    }

    @GetMapping("/itemDetail")
    public String detailReview(Model model, HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("collID"));
        Item itemsByCollID = itemMapper.queryItemById(id);
        model.addAttribute("reviewsByGameID", itemsByCollID);
        return "collectionList";
    }

    @GetMapping("/search")
    public String searchItems(HttpServletRequest request, Model model) {
        String search = request.getParameter("search");
        search = '%' + search + '%';
        List<Item> itemList = itemMapper.queryItemSearch(search);
        model.addAttribute("itemList", itemList);
        return "collectionList";
    }
}
