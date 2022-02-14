package com.bes8.Sprint8BE.service;

import com.bes8.Sprint8BE.domain.User;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtSecurityTokenGenerator implements SecurityTokenGenerator{


    @Override
    public Map<String, String> generateToken(User user) {
        String jwtoken = null;
        jwtoken = Jwts.builder().setSubject(user.getUserName()).setIssuedAt(new Date()).signWith(SignatureAlgorithm.HS256,"key").compact();

        Map<String,String> map = new HashMap<>();
        map.put("token", jwtoken);
        map.put("message", "User Successfully Logged In!!");
        return map;
    }


}
