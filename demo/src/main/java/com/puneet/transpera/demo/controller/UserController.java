package com.puneet.transpera.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import jakarta.servlet.http.HttpSession;
import com.puneet.transpera.demo.services.UserService;
import com.puneet.transpera.demo.entity.User;
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String registerPage(){
        return "Register";
    }

    @PostMapping("/register")
    @ResponseBody
    public String registerUser(
            @RequestParam String username,
            @RequestParam String email,
            @RequestParam String password
    ) {

        return userService.saveUser(
                username,
                email,
                password
        );
    }
    @GetMapping("/login")
    public String loginPage() {
        return "Login";
    }
    @PostMapping("/login")
    public String loginUser(
            @RequestParam String username,
            @RequestParam String password,
            HttpSession session
    ) {
        User user = userService.loginUser(username, password);

        if(user != null) {
            session.setAttribute("loggedInUser", user);
            return "redirect:/dashboard";
        }

        return "login";
    }
    @GetMapping("/logout")
    public String logoutUser(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
