package com.fitness.userservice.service;

import com.fitness.userservice.UserRepository;
import com.fitness.userservice.dto.RegisterRequest;
import com.fitness.userservice.dto.UserResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
//    private final UserRepository repository;

   private final UserRepository repository;
    public UserResponse register(RegisterRequest request) {

    }
}
