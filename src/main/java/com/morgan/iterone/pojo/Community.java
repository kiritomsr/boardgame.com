package com.morgan.iterone.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Community {
    private int communityID;
    private String name;
    private String country;
    private String city;
    private String intro;
    private double longitude,latitude;
}
