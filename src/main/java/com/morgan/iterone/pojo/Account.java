package com.morgan.iterone.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int userID;
    private String username;
    private String password;
    private String email;
    private String phone;

}
