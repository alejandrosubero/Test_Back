package com.testBack.subero.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class IndexController {

    public String index() {
        return "/index.html";
    }

}
