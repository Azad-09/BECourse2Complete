package com.bes8.Sprint8BE.service;

import com.bes8.Sprint8BE.domain.User;
import com.bes8.Sprint8BE.excption.UserNotFoundException;
import com.bes8.Sprint8BE.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements IUserService{

    private UserRepo userRepo;

    @Autowired
    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User findByUserNameAndPassword(String userName, String password) throws UserNotFoundException {
        User user = userRepo.findByUserNameAndPassword(userName, password);
        if(user == null){
            throw new UserNotFoundException();
        }else{
            return user;
        }
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }
}
