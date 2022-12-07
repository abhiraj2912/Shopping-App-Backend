package com.nest.shoppingappbackend.dao;

import com.nest.shoppingappbackend.model.Products;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductsDao extends CrudRepository<Products, Integer> {

    @Query(value = "SELECT `id`, `category`, `description`, `image`, `name`, `price` FROM `products` WHERE `name` LIKE %:name%",nativeQuery = true)
    List <Products> SearchProduct(@Param("name") String name);
}
