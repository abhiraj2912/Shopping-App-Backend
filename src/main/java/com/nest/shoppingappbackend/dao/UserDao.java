package com.nest.shoppingappbackend.dao;

import com.nest.shoppingappbackend.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {
}
