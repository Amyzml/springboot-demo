package com.zml.controller;

import com.zml.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model, HttpSession session){

        session.setAttribute("age","12");

        List<String> userList = Arrays.asList("aa","bb","cc");
        model.addAttribute("userList",userList);

        model.addAttribute("user",new User(1001,"rose","焦作"));
        return "index";
    }
}
