package com.example.THJava.sevice;

import com.example.THJava.entity.User;
import com.example.THJava.repository.IRoleRepository;
import com.example.THJava.repository.IuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IuserRepository iuserRepository;

    @Autowired
    private IRoleRepository iroleRepository;
    public void save(User user){
        iuserRepository.save(user);
        Long userId = iuserRepository.getUserIdByUsername(user.getUsername());
        Long roleId = iroleRepository.getRoleIdByName("User");
        if (roleId != 0 && userId !=0){
            iuserRepository.addRoleToUser(userId, roleId);
        }
    }

}
