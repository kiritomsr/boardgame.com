package com.morgan.iterone.mapper;

import com.morgan.iterone.pojo.Coll;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CollMapper {

    List<Coll> queryCollectionList();

    List<Coll> queryCollectionByName(String cname);

    Coll queryCollectionById(int collectID);

    List<Coll> queryCollectionSearch(String search);

    List<Coll> queryCollectionByUser(int userID);

    List<Coll> queryCollectionByVersion(int verID);

}
