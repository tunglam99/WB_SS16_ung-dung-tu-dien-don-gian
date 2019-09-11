package com.codegym.controller;

import com.codegym.repository.impl.DirectoryReposytoryImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DirectoryController {
    DirectoryReposytoryImpl directory  = new DirectoryReposytoryImpl();
    @RequestMapping(value = "/form")
    public String show(Model model){
        return "/form";
    }
    @RequestMapping(value = "/result")
    public String result(@RequestParam("word")String word,Model model){
        String result = directory.exchange(word);
        model.addAttribute("result",result);
        return "/result";
    }
}
