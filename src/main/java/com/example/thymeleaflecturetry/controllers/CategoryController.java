package com.example.thymeleaflecturetry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @GetMapping("/list")
    public String category(){
        return "category/categories-view";
    }
}
