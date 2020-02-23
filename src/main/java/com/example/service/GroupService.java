package com.example.service;

import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.relationaldataaccess.Group;
import java.util.List;

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

    public Group getGroupByID(long id) {
        String sql = "SELECT * FROM groups WHERE id = ?";

        Group group = (Group) jdbc.queryForObject(sql, new Object[] { id },
                new BeanPropertyRowMapper<>(Group.class));

        return group;
    }

    public ArrayList<Group> getListOfGroups(String emailId){
        String sql = "SELECT groupId FROM userGroups WHERE emailid = ?";

        List<Long> listOfGroups = jdbc.queryForObject(sql, new Object[] { id },
                new BeanPropertyRowMapper<>(Long.class));

        ArrayList<Group> groups = new ArrayList<Group>();
        for (int i=0;i<listOfGroups.size();i++){
            groups.add(this.getGroupByID(listOfGroups.get(i)))
        }
        return groups;
    }

    public String getTags(ArrayList <Group> listOfGroups){
        Strings interests = "";
        for (int i=0;i<listOfGroups.size();i++){
            Group group = listOfGroups.get(i);
            interests=+group.tag
        }
        return interests;
    }
}