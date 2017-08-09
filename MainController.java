package me.ratna.springdemo.controller;

import me.ratna.springdemo.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import javax.validation.Valid;

@Controller
public class MainController {
    @GetMapping("/song")
    public String loadsongPage(@Valid @ModelAttribute Song song, BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "song";
        }

        return "confirmsong";
    }
    @PostMapping("/song")
    public String loadsongPage(Model model)
    {
        model.addAttribute("Song", new Song());
        return "song";
    }
}
