package com.morgan.iterone.controller;

import com.morgan.iterone.mapper.AccountMapper;
import com.morgan.iterone.mapper.ReviewMapper;
import com.morgan.iterone.pojo.Review;
import com.morgan.iterone.pojo.Reviews;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ReviewController {

    @Autowired
    private ReviewMapper reviewMapper;
    @Autowired
    private AccountMapper accountMapper;



    @RequestMapping("/reviewLoad")
    public String loadReviews(Model model) {
        List<Review> reviewList = reviewMapper.queryReviewList();
        System.out.println(reviewList);
        model.addAttribute("reviewList", reviewList);
        return "game-details";
    }

    @RequestMapping("/reviewDetail")
    public String detailReview(Model model, HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("verID"));
        List<Review> reviewsByGameID = reviewMapper.queryReviewByVerID(id);
//        for (Review review : reviewsByGameID) {
//            int userID = review.getUserID();
//            String username = accountMapper.queryByUserID(userID).getUsername();
//            review.setUserName(username);
//            System.out.println("Username: " + username); // Debug print statement
//        }
        model.addAttribute("reviewsByGameID", reviewsByGameID);
        return "game-details";
    }


}
