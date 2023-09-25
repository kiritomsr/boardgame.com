package com.morgan.iterone.mapper;

import com.morgan.iterone.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface AccountMapper {

    List<Account> queryAccountList();

    Account queryByUsername(String username);

    Account queryByUserID(int userID);

    int addAccount(String username, String password, String email, String phone);

    int updateAccount(Account account);

}
