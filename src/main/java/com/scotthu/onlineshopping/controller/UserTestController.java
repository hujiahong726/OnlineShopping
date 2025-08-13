package com.scotthu.onlineshopping.controller;

import com.scotthu.onlineshopping.model.UserDemo;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserTestController {
    Map<Integer, UserDemo> users = new HashMap<>();

    @Resource (name="l4")
    UserDemo defaultUser;

    @PostMapping("/users")
    @ResponseBody
    public String CreateUser(@RequestParam("id") int id,
                             @RequestParam("name") String name,
                             @RequestParam("email") String email) {

        UserDemo userDemo2 = UserDemo.builder()
                .name(name)
                .id(id)
                .email(email).build();
        users.put(id, userDemo2);
        return "success";
    }

    @GetMapping("/users/{id}")
    public String GetAllUsers(@PathVariable("id") int id,
                                Map<String, Object> resultMap) {
        UserDemo userDemo = users.getOrDefault(id, defaultUser);
        resultMap.put("user", userDemo);
        return "user_detail";
    }
}
