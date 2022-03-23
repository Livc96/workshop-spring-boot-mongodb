package com.cordeirolivia.workshopmongo.services;

import com.cordeirolivia.workshopmongo.domain.User;
import com.cordeirolivia.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
       return userRepository.findAll();
    }
}
