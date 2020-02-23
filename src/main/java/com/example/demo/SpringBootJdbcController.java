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

        jdbc.execute("DROP TABLE IF EXISTS event;");

        jdbc.execute("CREATE TABLE event(Id INT PRIMARY KEY NOT NULL, name VARCHAR(100), groupId INT, startDate VARCHAR(100)), location VARCHAR(100), noOfHours INT;");

        jdbc.execute("DROP TABLE IF EXISTS group;");

        jdbc.execute("CREATE TABLE group(Id INT PRIMARY KEY NOT NULL, name VARCHAR(100), tag VARCHAR(100), noOfHours INT;");

        jdbc.execute("DROP TABLE IF EXISTS userEvents;");

        jdbc.execute("CREATE TABLE userEvents(emailId VARCHAR(100) NOT NULL, eventId INT, validationStatus VARCHAR(100), validationText VARCHAR(100));");;

        jdbc.execute("DROP TABLE IF EXISTS userGroups;");

        jdbc.execute("CREATE TABLE userGroups(emailId VARCHAR(100) NOT NULL, groupId INT);");

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

    @RequestMapping("/insertEvent")
    public int insertUser(@RequestParam("id") final Long id, @RequestParam("name") final String name,
                          @RequestParam("groupId") final long groupId, @RequestParam("startDateTime") final String startDateTime,
                          @RequestParam("location") final String location,@RequestParam("noOfHours") final String noOfHours) {
        final String sql = "INSERT INTO event(" + "id," + "name," + "groupId," + "location," + "noOfHours" + ")" + "VALUES(?, ?, ?, ?, ?, ?) ";

        final int[] types = new int[] { Types.INTEGER, Types.VARCHAR, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.INTEGER };

        final Object[] params = new Object[] {id, name, groupId, startDateTime, location, noOfHours};

        final int row = jdbc.update(sql, params, types);
        System.out.println(row + " row inserted.");
        return 0;
    }

    @RequestMapping("/insertGroup")
    public int insertUser(@RequestParam("id") final long id, @RequestParam("name") final String name,
                          @RequestParam("tag") final String tag) {
        final String sql = "INSERT INTO group(" + "id," + "name," + "tag" + ")" + "VALUES(?, ?, ?)";

        final int[] types = new int[] {Types.INTEGER, Types.VARCHAR, Types.VARCHAR};

        final Object[] params = new Object[] {id, name, tag};

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