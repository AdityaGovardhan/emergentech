package com.example.service;

import com.example.relationaldataaccess.UserEvent;

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

    public UserEvent getUserEventByID(String userEventId, String emailId){
        String sql = "SELECT * FROM userEvents WHERE eventId = ? and userId = ?";

        UserEvent userEvent = (UserEvent) jdbc.queryForObject(sql,
            new Object[] { userEventId, emailId },
                new BeanPropertyRowMapper<>(UserEvent.class));

        return userEvent;
    }

    public int validateUser(String userEventId, String emailId){
        String sql = "UPDATE userEvents SET status = 1 WHERE eventId = ? and userId = ?";

        jdbc.update(sql, userEventId, emailId);

        return 0;

    }


}