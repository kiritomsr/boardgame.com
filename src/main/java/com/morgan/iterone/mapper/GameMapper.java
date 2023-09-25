package com.morgan.iterone.mapper;

import com.morgan.iterone.pojo.Account;
import com.morgan.iterone.pojo.Enumeration;
import com.morgan.iterone.pojo.Game;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface GameMapper {

    List<Game> queryGameList();

    List<Game> queryGameByGname(String gname);

    Game queryGameByGameID(int gameID);

    List<Game> queryGameSearch(String search);

    List<Game> queryGameFilter(String category, String genre);
    List<Enumeration> queryEnumeration(String etype);
}
