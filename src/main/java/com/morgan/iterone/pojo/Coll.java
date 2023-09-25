package com.morgan.iterone.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coll {
    private int collectID, userID, verID, privacy;
    private String cname, description;
    private List<Item> items;

}
