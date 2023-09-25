package com.morgan.iterone.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Enumeration {
    private String etype;
    private String ename;
}
