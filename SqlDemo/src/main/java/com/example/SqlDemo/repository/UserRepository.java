package com.example.SqlDemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.SqlDemo.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
