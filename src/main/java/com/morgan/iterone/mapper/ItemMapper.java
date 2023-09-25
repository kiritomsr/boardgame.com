package com.morgan.iterone.mapper;

import com.morgan.iterone.pojo.Item;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ItemMapper {

    List<Item> queryItemList();

    List<Item> queryItemByCollectID(int collectID);

    Item queryItemById(int itemId);

    List<Item> queryItemSearch(String search);

    List<Item> queryItemFilter(String type);

}
