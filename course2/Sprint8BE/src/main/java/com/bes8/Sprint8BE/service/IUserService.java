package com.bes8.Sprint8BE.service;

import com.bes8.Sprint8BE.domain.User;
import com.bes8.Sprint8BE.excption.UserNotFoundException;

import java.util.List;

public interface IUserService {
public User saveUser(User user);
public User findByUserNameAndPassword(String userName, String password) throws UserNotFoundException;
List<User> getAllUser();
}
