package com.springbootexercise.springbootproject.dao;

import com.springbootexercise.springbootproject.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    // accepts type User where the id is integer
}
