package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Types;

import com.example.relationaldataaccess.User;
@RestController
public class SpringBootJdbcController {
    
    @Autowired
    JdbcTemplate jdbc;
    
    @RequestMapping("/createTables")
    public String index(){
        jdbc.execute("DROP TABLE IF EXISTS user;");

        jdbc.execute("CREATE TABLE user(emailId VARCHAR(100) PRIMARY KEY NOT NULL, name VARCHAR(100), age INT);");

        jdbc.execute("CREATE TABLE event(Id INT PRIMARY KEY NOT NULL, name VARCHAR(100), groupId INT, startDate VARCHAR(100)), location VARCHAR(100), noOfHours INT;")

        jdbc.execute("CREATE TABLE group(Id INT PRIMARY KEY NOT NULL, name VARCHAR(100), tag VARCHAR(100), noOfHours INT;")

        jdbc.execute("CREATE TABLE userEvents(emailId VARCHAR(100) NOT NULL, eventId INT, validationStatus VARCHAR(100), validationText VARCHAR(100));");

        jdbc.execute("CREATE TABLE userGroups(emailId VARCHAR(100) NOT NULL, groupId INT);");



        // jdbc.execute("insert into user(name,email) values('javatpoint','java@javatpoint.com')");

        // String id = "javatpoint";

        // int rowCount = this.jdbc.queryForObject("SELECT * FROM CUSTOMER WHERE name = ?", new Object[]{id}, (rs, rowNum) ->
        // new Customer(
        //         rs.getString("name"),
        //         rs.getInt("age"),
        //         rs.getTimestamp("created_date").toLocalDateTime()
        // ));
        // System.out.println(rowCount);
        return "Table created successfully";
    }

    @RequestMapping("/insertUser")
    public int insertUser(@RequestParam("emailId") final String emailId, @RequestParam("name") final String name,
            @RequestParam("age") final int age) {
        final String sql = "INSERT INTO user(" + "emailId," + "name," + "age" + ")" + "VALUES(?, ?, ?)";

        final int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.INTEGER };

        final Object[] params = new Object[] { emailId, name, age };

        final int row = jdbc.update(sql, params, types);
        System.out.println(row + " row inserted.");
        return 0;
    }

    @RequestMapping("/getUser")
    public User findByUserID(@RequestParam("emailId") String emailId) {
        final String sql = "SELECT * FROM user WHERE emailId = ?";

        final User user = (User) jdbc.queryForObject(sql, new Object[] { emailId },
                new BeanPropertyRowMapper<>(User.class));

       System.out.println(user.getAge());
//
//        Query query = entityManager.createQuery(sql, User.class);
//        query.setParameter("username", username);
        return user;
    }
}