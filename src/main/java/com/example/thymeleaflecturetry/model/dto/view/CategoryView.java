package com.example.thymeleaflecturetry.model.dto.view;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CategoryView {

    private int id;
    private String name;
    private LocalDate createDate;

}
