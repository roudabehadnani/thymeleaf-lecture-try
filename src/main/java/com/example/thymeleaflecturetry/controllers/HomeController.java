package com.example.thymeleaflecturetry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = {"/","","/index"}, method = RequestMethod.GET)
    public String defaultPage(){
        return "index";
    }

    @GetMapping("/homepage")
    public String homePage(){
        return "index";
    }

    @GetMapping("/costume")
    public String costumeMessage(Model model){
        String message = "Message from the Controller";
        model.addAttribute("message", message);
        return "index";
    }


}
