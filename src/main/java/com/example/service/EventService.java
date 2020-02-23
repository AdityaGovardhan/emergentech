package com.example.service;

import java.sql.Types;

import com.example.relationaldataaccess.Event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EventService{

    @Autowired
    JdbcTemplate jdbc;

    public EventService(){
    }

    public Event getEventByID(long eventId){
        final String sql = "GET * FROM events where eventId = ?";

        Event event = jdbc.queryForObject(sql, new Object[]{eventId}, Event.class);
        
        return event;
    }

    public int insertEvent(long id, String name, long groupId, String startDateTime, String location, double noOfHours){
        final String sql = "INSERT INTO events(" + "id," + "name," + "groupId," + "startDateTime," + "location," + "noOfHours" + ")" + "VALUES(?, ?, ?, ?, ?, ?) ";

        final int[] types = new int[] { Types.INTEGER, Types.VARCHAR, Types.INTEGER, Types.VARCHAR, Types.VARCHAR, Types.INTEGER };

        final Object[] params = new Object[] {id, name, groupId, startDateTime, location, noOfHours};

        final int row = jdbc.update(sql, params, types);
        System.out.println(row + " event inserted.");

        return 0;
    }


}