package com.example.THJava.repository;

import com.example.THJava.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ICategoryRepository extends JpaRepository<Category, Long> {

    }

