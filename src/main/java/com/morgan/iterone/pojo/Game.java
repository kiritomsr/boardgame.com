package com.morgan.iterone.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private int gameID;
    private String gname;
    private String category;
    private String genre;
    private String intro;
}
