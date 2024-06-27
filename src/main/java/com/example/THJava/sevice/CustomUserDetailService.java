package com.example.THJava.sevice;

import com.example.THJava.entity.CustomUserDetail;
import com.example.THJava.entity.User;
import com.example.THJava.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {


    @Autowired
    private IuserRepository iuserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = iuserRepository.findByUsername(username);
        if (user == null)
            throw  new UsernameNotFoundException("User not found");
        return new CustomUserDetail(user , iuserRepository);
    }

}
