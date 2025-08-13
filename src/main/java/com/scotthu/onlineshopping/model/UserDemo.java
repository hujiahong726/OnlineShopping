package com.scotthu.onlineshopping.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class UserDemo {
    private int id;
    private String name;
    private String email;

}
