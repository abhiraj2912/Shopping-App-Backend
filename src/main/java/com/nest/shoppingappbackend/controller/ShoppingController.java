package com.nest.shoppingappbackend.controller;

import com.nest.shoppingappbackend.dao.ProductsDao;
import com.nest.shoppingappbackend.dao.UserDao;
import com.nest.shoppingappbackend.model.Products;
import com.nest.shoppingappbackend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    private ProductsDao pdao;
    @Autowired
    private UserDao udao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/useradd", consumes = "application/json", produces = "application/json")
    public HashMap<String, String> AddUser(@RequestBody User u){
        udao.save(u);
        HashMap <String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addproduct", consumes = "application/json", produces = "application/json")
    public HashMap<String, String>  AddProduct(@RequestBody Products p){
        pdao.save(p);
        HashMap <String, String> map = new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewproduct")
    public List<Products> ViewProduct(){
        return (List<Products>) pdao.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/login")
    public List<User> Login(){
        return (List<User>) udao.findAll();
    }

}
