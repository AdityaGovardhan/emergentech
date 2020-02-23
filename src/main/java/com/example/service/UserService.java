// package com.example.service;

// import com.example.relationaldataaccess.User;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import java.sql.Types;

// @RestController
// public class UserService {

//     @Autowired
//     JdbcTemplate jdbc;

//     @RequestMapping("/getUserByID")
//     public User findByUserID(String emailId) {
// //        String sql = "Select e from " + User.class.getName() + " e "
// //                + " Where e.userName = :userName ";
// //
// //        Query query = entityManager.createQuery(sql, User.class);
// //        query.setParameter("username", username);
//         return null;
//     }

//     @RequestMapping("/insertUser")
//     public int insertUser(@RequestParam("emailId") String emailId, @RequestParam("name") String name, @RequestParam("age") int age){
//         String sql =    "INSERT INTO user(" + 
//                         "emailId," +
//                         "name," + 
//                         "age" + 
//                         ")" + "VALUES(?, ?, ?)";

//         int[] types = new int[] { Types.VARCHAR, Types.VARCHAR, Types.INTEGER};

//         Object[] params = new Object[] { emailId, name, age};

//         int row = jdbc.update(sql, params, types);
//         System.out.println(row + " row inserted.");
//         return 0;
//     }

//     // public HashMap<User, ArrayList<Tag>> findUserInterests(User user){
//     //     ArrayList<Group> groups = user.groupsEnrolled;
//     //     ArrayList<com.example.relationaldataaccess.Tag> tags = new ArrayList<com.example.relationaldataaccess.Tag>();

//     //     for(int i=0; i<groups.size(); i++){
//     //         tags.addALL(groups.get(i).tags);
//     //     }

//     //     System.out.println(tags);

//     //     HashMap<User, ArrayList<com.example.relationaldataaccess.Tag>> userProfile = new HashMap<String, ArrayList<com.example.relationaldataaccess.Tag>>();
//     //     return userProfile;
//     // }
// }