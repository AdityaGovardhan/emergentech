package com.example.service;

import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

    @Autowired
    JdbcTemplate jdbc;

    public GroupService(){
    }

    public int insertGroup(long id, String name, String tag){
        final String sql = "INSERT INTO groups(" + "id," + "name," + "tag" + ")" + "VALUES(?, ?, ?)";

        final int[] types = new int[] {Types.INTEGER, Types.VARCHAR, Types.VARCHAR};

        final Object[] params = new Object[] {id, name, tag};

        final int row = jdbc.update(sql, params, types);
        System.out.println(row + " group inserted.");
        return 0;
    }
}