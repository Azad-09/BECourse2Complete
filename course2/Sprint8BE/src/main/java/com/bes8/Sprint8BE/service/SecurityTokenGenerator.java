package com.bes8.Sprint8BE.service;

import com.bes8.Sprint8BE.domain.User;

import java.util.Map;

public interface SecurityTokenGenerator {
    Map<String, String> generateToken(User user);
}
