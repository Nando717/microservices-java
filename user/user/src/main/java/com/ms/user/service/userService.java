package com.ms.user.service;

import com.ms.user.models.UserModel;
import com.ms.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class userService {

    @Autowired
    UserRepository userRepository;


    @Transactional
    public UserModel save(UserModel usermodel){
        return userRepository.save(usermodel);
    }
}
