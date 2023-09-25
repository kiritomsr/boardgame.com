package com.morgan.iterone.mapper;

import com.morgan.iterone.pojo.Review;
import com.morgan.iterone.pojo.Reviews;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ReviewMapper {

    List<Review> queryReviewList();

    Review queryReviewById(int reviewID);

    List<Review> queryReviewSearch(String text);

    List<Review> queryReviewByVerID(int verID);

    Reviews queryReviewsByVerID(int verID);

    List<Review> queryReviewByUserID(String userID);

}
