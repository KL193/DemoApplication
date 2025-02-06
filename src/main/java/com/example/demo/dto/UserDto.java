package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor //creates noargs constructor
@AllArgsConstructor //creates constructors for each properties
public class UserDto {

    private int id;
    private String name;
}
