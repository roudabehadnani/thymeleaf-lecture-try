package com.example.thymeleaflecturetry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {


    @GetMapping
    public String dashboard(Model model){
        LocalDate currentDate = LocalDate.now();

        model.addAttribute("serverDate",currentDate);

        model.addAttribute("productListSize",65);
        model.addAttribute("categoryListSize",30);
        model.addAttribute("userListSize",100);

        return "dashboard";
    }
}
