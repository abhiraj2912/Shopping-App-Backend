package com.nest.shoppingappbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/useradd", consumes = "application/json", produces = "application/json")
    public String AddUser(){
        return "user add";
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addproduct", consumes = "application/json", produces = "application/json")
    public String AddProduct(){
        return "product add";
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewproduct")
    public String ViewProduct(){
        return "products";
    }

}
