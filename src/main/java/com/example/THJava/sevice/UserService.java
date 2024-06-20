package com.example.THJava.sevice;

import com.example.THJava.entity.User;
import com.example.THJava.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IuserRepository iuserRepository;
    public void save(User user){
        iuserRepository.save(user);

    }
}
