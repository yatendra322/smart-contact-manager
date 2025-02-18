package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
@RequestMapping("/user")
public class UserController {

    //user dashboard page

    @RequestMapping(value ="/dashboard")
    public String userDashboard() {
        System.out.println("User dashboard");
      return "user/dashboard";
    }
    
   @GetMapping("/profile")
public String userProfile() {
    return "user/profile"; // Ensure this matches the template path
}

    
    //user add contacts page

    //user view contacts

    //user edit contact

    //user delete contact

    //user search contact




}
