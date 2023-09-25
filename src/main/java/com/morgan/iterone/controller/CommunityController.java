package com.morgan.iterone.controller;

import com.morgan.iterone.mapper.CommunityMapper;
import com.morgan.iterone.pojo.Community;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CommunityController {

    @Autowired
    private CommunityMapper communityMapper;

    @GetMapping(value = "/communityLoad", produces = MediaType.TEXT_HTML_VALUE)
    public String loadCommunity(Model model) {
        List<Community> communityList = communityMapper.queryCommunityList();
        model.addAttribute("communityList", communityList);
        return "communityList";
    }

    @GetMapping(value = "/communityDetail", produces = MediaType.TEXT_HTML_VALUE)
    public String detailCommunity(Model model, HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        Community thisCommunity = communityMapper.queryCommunityById(id);
        model.addAttribute("community", thisCommunity);
        return "community-details";
    }

    @GetMapping(value = "/communitySearch", produces = MediaType.TEXT_HTML_VALUE)
    public String searchCommunities(@RequestParam("search") String search, Model model) {
        search = '%' + search + '%';
        List<Community> communityList = communityMapper.queryCommunitySearch(search);
        model.addAttribute("communityList", communityList);
        return "communityList";
    }

    @GetMapping(value = "/communityFilter", produces = MediaType.TEXT_HTML_VALUE)
    public String filterCommunities(HttpServletRequest request, Model model) {
        String country = request.getParameter("country");
        String city = request.getParameter("city");
        List<Community> communityListByCountry = communityMapper.queryCommunityByCountry(country);
        List<Community> communityListByCity = communityMapper.queryCommunityByCountry(city);
        model.addAttribute("communityListByCountry", communityListByCountry);
        model.addAttribute("communityListByCity", communityListByCity);
        return "communityList";
    }

    @GetMapping("/api/communities")
    @ResponseBody
    public List<Community> getCommunities() {
        return communityMapper.queryCommunityList();
    }
}
