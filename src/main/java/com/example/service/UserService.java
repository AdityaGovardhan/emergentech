package com.example.service;
import java.util.HashMap;
import java.util.ArrayList;
import com.example.relationaldataaccess.User;
import com.example.relationaldataaccess.UserEvent;
import com.example.relationaldataaccess.Group;

@Component
public class UserService {

    @Autowired
    EntityManager entityManager;

    @Autowired
    UserRepository userRepository;

    public User findByUserID(String emailId) {
//        String sql = "Select e from " + User.class.getName() + " e "
//                + " Where e.userName = :userName ";
//
//        Query query = entityManager.createQuery(sql, User.class);
//        query.setParameter("username", username);
        return user;
    }

    public HashMap<User, ArrayList<Tag>> findUserInterests(User user){
        ArrayList<Group> groups = user.groupsEnrolled;
        ArrayList<com.example.relationaldataaccess.Tag> tags = new ArrayList<com.example.relationaldataaccess.Tag>();

        for(int i=0; i<groups.size(); i++){
            tags.addALL(groups.get(i).tags);
        }

        System.out.println(tags);

        HashMap<User, ArrayList<com.example.relationaldataaccess.Tag>> userProfile = new HashMap<String, ArrayList<com.example.relationaldataaccess.Tag>>();
        return userProfile;
    }
}