package com.bes8.Sprint8BE.repo;

import com.bes8.Sprint8BE.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    public User findByUserNameAndPassword(String userName, String password);

    }
