package com.example.THJava.repository;


import com.example.THJava.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u FROM User u Where u.username = ?1")
    User findByUsername(String username);
}
