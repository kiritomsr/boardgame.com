package com.morgan.iterone.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Version {
    private int verID;
    private int gameID;
    private String vname;
    private String players;
    private String time;
    private String designer;
    private String description;
}
