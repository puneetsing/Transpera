package com.puneet.transpera.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.puneet.transpera.demo.entity.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class profileController {


    @GetMapping("/profile")
    public String profile(HttpSession session, Model model) {


        User user = 
        (User) session.getAttribute("loggedInUser");


        if(user == null) {
            return "redirect:/login";
        }


        model.addAttribute("user", user);


        return "profile";
    }

}