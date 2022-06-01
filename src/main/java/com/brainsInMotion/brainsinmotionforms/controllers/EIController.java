package com.brainsInMotion.brainsinmotionforms.controllers;

import com.brainsInMotion.brainsinmotionforms.models.EIEnums.AssessmentLocation;
import com.brainsInMotion.brainsinmotionforms.models.EIEnums.Languages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("forms")
public class EIController {
    @GetMapping("EI")
    public String displayEIForm(Model model){
        model.addAttribute("languages", Languages.values());
        model.addAttribute("assessLocation", AssessmentLocation.values());

        return "forms/EI";
    }
}
