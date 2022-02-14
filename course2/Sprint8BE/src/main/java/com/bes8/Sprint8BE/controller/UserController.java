package com.bes8.Sprint8BE.controller;

import com.bes8.Sprint8BE.domain.User;
import com.bes8.Sprint8BE.excption.UserNotFoundException;
import com.bes8.Sprint8BE.service.SecurityTokenGenerator;
import com.bes8.Sprint8BE.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public class UserController {

    private ResponseEntity responseEntity;
    private UserService userService;
    private SecurityTokenGenerator securityTokenGenerator;


    @Autowired
    public UserController(UserService userService , SecurityTokenGenerator securityTokenGenerator)
    {
        this.userService = userService;
        this.securityTokenGenerator = securityTokenGenerator;
    }


    //Should only give username and password
    @PostMapping("/login")
    public ResponseEntity loginUser(@RequestBody User user) throws UserNotFoundException {

        Map<String, String> map = null;
        try {
            User userObj = userService.findByUserNameAndPassword(user.getUserName(), user.getPassword());
            if (userObj.getUserName().equals(user.getUserName())) {
                map = securityTokenGenerator.generateToken(user);
            }
            responseEntity = new ResponseEntity(map, HttpStatus.OK);
        }
        catch(UserNotFoundException e){
            throw new UserNotFoundException();
        }
        catch (Exception e){
            responseEntity = new ResponseEntity("Try after sometime!!!", HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return responseEntity;
    }

    // first step - register the user
    @PostMapping("/register")
    public ResponseEntity saveUser(@RequestBody User user) {

        User createdUser = userService.saveUser(user);
        return responseEntity = new ResponseEntity("User Created" , HttpStatus.CREATED);
    }

    @GetMapping("/api/v1/userservice/users")
    public ResponseEntity getAllUsers(HttpServletRequest request){

        List<User> list =  userService.getAllUser();
        responseEntity = new ResponseEntity(list,HttpStatus.OK);
        return responseEntity;

    }

}
