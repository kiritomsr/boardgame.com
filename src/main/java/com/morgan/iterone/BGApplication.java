package com.morgan.iterone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootApplication
public class BGApplication {

    @Autowired
    DataSource dataSource;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        SpringApplication.run(BGApplication.class, args);


    }

}
