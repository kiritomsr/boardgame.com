package com.morgan.iterone.mapper;

import com.morgan.iterone.pojo.Store;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StoreMapper {

    List<Store> queryStoreList();

    Store queryStoreById(int id);

    List<Store> queryStoreSearch(String search);

    List<Store> queryStoreByVerID(String verID);

    List<Store> queryStoreByUserID(String userID);

}
