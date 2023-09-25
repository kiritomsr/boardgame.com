package com.morgan.iterone.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private int itemID, collectID;
    private String intro, pic, type;
}
