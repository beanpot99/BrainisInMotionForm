package com.brainsInMotion.brainsinmotionforms.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("forms")
public class EIController {
    @GetMapping("EI")
    public String displayEIForm(Model model){
        return "forms/EI";
    }
}
