package com.example.songdemo2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @GetMapping("/songform")
    public String loadForm(Model model){
        model.addAttribute("song", new Song());
        return "songform";
    }
    @PostMapping("/songform")
    public String loadFromPage(@ModelAttribute Song song, Model model) {
        model.addAttribute("song", song);
        return "songconfirm";
    }
    @RequestMapping("/songconfirm")
    public String loadLastSong(@ModelAttribute Song song, Model model) {
        model.addAttribute("song", song);
        return "songconfirm";
    }

    }
