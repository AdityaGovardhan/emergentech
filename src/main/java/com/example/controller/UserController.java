package com.example.controller;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public User getUserInfo(String UserId) {

        return user;
    }
}
