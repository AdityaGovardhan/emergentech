package com.example.demo;

import com.example.relationaldataaccess.User;
import com.example.service.EventService;
import com.example.service.GroupService;
import com.example.service.UserEventService;
import com.example.service.UserService;
import java.util.Set;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {

    @Autowired
    JdbcTemplate jdbc;

    @Autowired
    UserService userService;

    @Autowired
    EventService eventService;

    @Autowired
    GroupService groupService;

    @Autowired
    UserEventService userEventService;
    
    @RequestMapping("/createTables")
    public int createTables(){
        jdbc.execute("DROP TABLE IF EXISTS users;");
        jdbc.execute("CREATE TABLE users(emailId VARCHAR(100) PRIMARY KEY NOT NULL, name VARCHAR(100), age INT);");

        jdbc.execute("DROP TABLE IF EXISTS events;");
        jdbc.execute("CREATE TABLE events(Id INT PRIMARY KEY NOT NULL, name VARCHAR(100), groupId INT, startDateTime VARCHAR(100), location VARCHAR(100), noOfHours INT);");

        jdbc.execute("DROP TABLE IF EXISTS groups;");
        jdbc.execute("CREATE TABLE groups(Id INT PRIMARY KEY NOT NULL, name VARCHAR(100), tag VARCHAR(100));");

        jdbc.execute("DROP TABLE IF EXISTS userEvents;");
        jdbc.execute("CREATE TABLE userEvents(emailId VARCHAR(100) NOT NULL, eventId INT, status INT, validationString VARCHAR(100), noOfHours INT);");

        jdbc.execute("DROP TABLE IF EXISTS userGroups;");
        jdbc.execute("CREATE TABLE userGroups(emailId VARCHAR(100) NOT NULL, groupId INT);");

        System.out.println("Table created successfully");
        return 0;
    }

    @RequestMapping("/insertUser")
    public int insertUser(@RequestParam("emailId") final String emailId, @RequestParam("name") final String name,
            @RequestParam("age") final int age) {

        return userService.insetUser(emailId, name, age);
    }

    @RequestMapping("/getUser")
    public User getUser(@RequestParam("emailId") final String emailId) {
        User user = userService.getUserByID(emailId);
        user.setGroupsEnrolled(groupServicegetListOfGroups(emailId));
        String tags = groupService.getTags(user.setGroupsEnrolled());

        user.setEventsEnrolled(eventService.getUserEvents(emailId))

        user.setInterests((Set) (Arrays.asList(tags.split(","))));

        return user;
    }

    @RequestMapping("/insertEvent")
    public int insertEvent(@RequestParam("id") final long id, @RequestParam("name") final String name,
            @RequestParam("groupId") final long groupId, @RequestParam("startDateTime") final String startDateTime,
            @RequestParam("location") final String location, @RequestParam("noOfHours") final double noOfHours) {

        return eventService.insertEvent(id, name, groupId, startDateTime, location, noOfHours);
    }

    @RequestMapping("/insertGroup")
    public int insertGroup(@RequestParam("id") final long id, @RequestParam("name") final String name,
            @RequestParam("tag") final String tag) {

        return groupService.insertGroup(id, name, tag);
    }

    @RequestMapping("/validateUserHours")
    public int validateUserHours(@RequestParam("eventId") final String userEventId,
            @RequestParam("userId") final String emailId) {

        return userEventService.validateUser(userEventId, emailId);
    }
}