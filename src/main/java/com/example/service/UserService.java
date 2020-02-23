package com.example.service;

import com.example.relationaldataaccess.User;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    public User findByUserID(String emailId) {
//        String sql = "Select e from " + User.class.getName() + " e "
//                + " Where e.userName = :userName ";
//
//        Query query = entityManager.createQuery(sql, User.class);
//        query.setParameter("username", username);
        return null;
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