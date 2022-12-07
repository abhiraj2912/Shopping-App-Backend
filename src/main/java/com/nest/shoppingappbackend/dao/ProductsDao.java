package com.nest.shoppingappbackend.dao;

import com.nest.shoppingappbackend.model.Products;
import org.springframework.data.repository.CrudRepository;

public interface ProductsDao extends CrudRepository<Products, Integer> {
}
