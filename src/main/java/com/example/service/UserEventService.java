package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserEventService{

    @Autowired
    JdbcTemplate jdbc;

    public UserEventService(){
    }

    public List<Long> getUserEvents(String emailId){
        String sql = "SELECT eventId FROM userEvents WHERE userId = " + emailId;

        List<Long> userEvents = jdbc.query(sql,
                new BeanPropertyRowMapper<>(Long.class));

        ArrayList<Group> events = new ArrayList<Event>();
        for (int i=0;i<userEvents.size();i++){
            events.add(this.getEventByID(userEvents.get(i)))
        }
        return events;
    }

    public List<String> getEventUsers(long eventId){
        String sql = "SELECT userId FROM userEvents WHERE eventId = " + eventId;

        List<String> eventUsers = jdbc.query(sql,
                new BeanPropertyRowMapper<>(String.class));

        return eventUsers;
    }

    public int validateUser(String userEventId, String emailId){
        String sql = "UPDATE userEvents SET status = 1 WHERE eventId = ? and userId = ?";

        jdbc.update(sql, userEventId, emailId);

        return 0;

    }


}