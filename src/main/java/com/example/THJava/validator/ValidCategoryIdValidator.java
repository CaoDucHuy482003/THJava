package com.example.THJava.validator;

import com.example.THJava.entity.Category;
import com.example.THJava.validator.annotation.ValidCategoryId;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context) {
        return category != null && category.getId() != null;
    }
}