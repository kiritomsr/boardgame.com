package com.morgan.iterone.mapper;

import com.morgan.iterone.pojo.Game;
import com.morgan.iterone.pojo.Version;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface VersionMapper {

    List<Version> queryVersionList();

    List<Version> queryVersionByVname(String vname);

    Version queryVersionByVerID(int verID);

    List<Version> queryVersionByGameID(int gameID);

    List<Version> queryVersionSearch(String search);
}
