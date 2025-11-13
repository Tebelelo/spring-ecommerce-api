package com.codewithmosh.store.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    //we use model to pass data
    public String index( Model model){
        model.addAttribute("name","Tebelelo");
        return "index";

    }
}
