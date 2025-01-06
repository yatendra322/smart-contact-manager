package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler ");
        model.addAttribute("name", "yatendra");
        model.addAttribute("youtubeChannel", "youtube channel");
        model.addAttribute("githubRepo", "Github channel");
        return "home";
    }

    // about route
    @RequestMapping("/about")
    public String requestMethodName(Model model) {
        model.addAttribute("isLogin", false);
        System.out.println("About page loading ...");
        return "about";
    }

    // servicess
    @RequestMapping("/services")
    public String servicePage() {
        System.out.println("Service page loading ... ");
        return "services";
    }

    @RequestMapping("/contact")
    public String contact() {
        System.out.println("contact page loading ... ");
        return "contact";
    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("login page loading ... ");
        return "login";
    }

    @RequestMapping("/register")
    public String regster() {
        System.out.println("regster page loading ... ");
        return "register";
    }


}
