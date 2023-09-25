package com.morgan.iterone.mapper;

import com.morgan.iterone.pojo.Community;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CommunityMapper {

    List<Community> queryCommunityList();

    List<Community> queryCommunityByName(String name);

    Community queryCommunityById(int id);

    List<Community> queryCommunitySearch(String search);

    List<Community> queryCommunityByCity(String city);

    List<Community> queryCommunityByCountry(String country);

}
