package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SpringBootJdbcController {
    @Autowired
    JdbcTemplate jdbc;
    @RequestMapping("/insert")
    public String index(){
        jdbc.execute("DROP TABLE IF EXISTS user;");

        jdbc.execute("create table user(id int UNSIGNED primary key not null auto_increment, name varchar(100), email varchar(100));");

        jdbc.execute("insert into user(name,email) values('javatpoint','java@javatpoint.com')");

        // String id = "javatpoint";

        // int rowCount = this.jdbc.queryForObject("SELECT * FROM CUSTOMER WHERE name = ?", new Object[]{id}, (rs, rowNum) ->
        // new Customer(
        //         rs.getString("name"),
        //         rs.getInt("age"),
        //         rs.getTimestamp("created_date").toLocalDateTime()
        // ));
        // System.out.println(rowCount);
        return "data inserted Successfully";
    }
}