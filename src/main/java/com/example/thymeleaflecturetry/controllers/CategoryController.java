package com.example.thymeleaflecturetry.controllers;

import com.example.thymeleaflecturetry.model.dto.view.CategoryView;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {

    List<CategoryView> categoryViewList = new ArrayList<>();

    public CategoryController() {
        categoryViewList.add(new CategoryView(1,"Fuel", LocalDate.now()));
        categoryViewList.add(new CategoryView(2,"Clothes", LocalDate.now()));
        categoryViewList.add(new CategoryView(3,"Scarf", LocalDate.now()));
        categoryViewList.add(new CategoryView(4,"Food", LocalDate.now()));
        categoryViewList.add(new CategoryView(5,"Electronics", LocalDate.now()));
    }

    @GetMapping("/list")
    public String category(Model model){

        LocalDate currentDate = LocalDate.now();
        model.addAttribute("serverDate", currentDate);
        model.addAttribute("categoryListSize", categoryViewList.size());

        model.addAttribute("categoryViews",categoryViewList);

        return "category/categories-view";
    }

    @GetMapping("/view/{id}")
    public String findById(@PathVariable("id") int id, Model model){

        System.out.println("this Id:" + id);

        CategoryView categoryView = categoryViewList.stream().filter(category -> category.getId() == id).findFirst().orElse(null);

        model.addAttribute("categoryView", categoryView );

        return "category/category-view";
    }

    @PostMapping("/view")
    public String findByIdPost(@RequestParam("id") Integer id, Model model){

        System.out.println("this Id:" + id);

        CategoryView categoryView = categoryViewList.stream().filter(category -> category.getId() == id).findFirst().orElse(null);

        model.addAttribute("categoryView", categoryView );

        return "category/category-view";
    }


}
