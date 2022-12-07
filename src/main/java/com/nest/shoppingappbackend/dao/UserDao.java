package com.nest.shoppingappbackend.dao;

import com.nest.shoppingappbackend.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<User,Integer> {

    @Query(value = "SELECT `id`, `address`, `email`, `name`, `password`, `phone` FROM `users` WHERE `email` = :email AND `password`= :password",nativeQuery = true)
    List <User> LoginCheck(@Param("email") String email, @Param("password") String password);
}
