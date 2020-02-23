package com.example.service;

import java.sql.Types;

import com.example.relationaldataaccess.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    JdbcTemplate jdbc;

    public UserService(){
    }

    public User getUserByID(String emailId) {
        String sql = "SELECT * FROM users WHERE emailId = ?";

        if(jdbc == null){
            System.out.println("YES");
        }

        User user = (User) jdbc.queryForObject(sql, new Object[] { emailId },
                new BeanPropertyRowMapper<>(User.class));

        return user;
    }

    public int insetUser(String emailId, String name, int age) {
        final String sql = "INSERT INTO users(" + "emailId," + "name," + "age" + ")" + "VALUES(?, ?, ?)";

        final int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.INTEGER };

        final Object[] params = new Object[] { emailId, name, age };

        final int row = jdbc.update(sql, params, types);
        System.out.println(row + " user inserted.");

        return 0;
    }

    // public HashMap<User, ArrayList<Tag>> findUserInterests(User user){
    //     ArrayList<Group> groups = user.groupsEnrolled;
    //     ArrayList<com.example.relationaldataaccess.Tag> tags = new ArrayList<com.example.relationaldataaccess.Tag>();

    //     for(int i=0; i<groups.size(); i++){
    //         tags.addALL(groups.get(i).tags);
    //     }

    //     System.out.println(tags);

    //     HashMap<User, ArrayList<com.example.relationaldataaccess.Tag>> userProfile = new HashMap<String, ArrayList<com.example.relationaldataaccess.Tag>>();
    //     return userProfile;
    // }
}