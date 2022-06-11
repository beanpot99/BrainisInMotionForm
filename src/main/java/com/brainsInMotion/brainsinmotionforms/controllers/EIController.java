package com.brainsInMotion.brainsinmotionforms.controllers;

import com.brainsInMotion.brainsinmotionforms.models.EIEnums.AssessmentLocation;
import com.brainsInMotion.brainsinmotionforms.models.EIEnums.Languages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
@RequestMapping("forms")
public class EIController {
    static HashMap<String, String> toddlerSensoryQuadrants = new HashMap<>();
    static HashMap<String, String > toddlerSensoryBehavioral = new HashMap<>();
    public EIController() {
        toddlerSensoryQuadrants.put("Seeking/Seeker", "/35");
        toddlerSensoryQuadrants.put("Avoiding/Avoider", "/55");
        toddlerSensoryQuadrants.put("Sensitivity/Sensor", "/65");
        toddlerSensoryQuadrants.put("Registration/Bystander", "/55");
        toddlerSensoryBehavioral.put("General", "/50");
        toddlerSensoryBehavioral.put("Auditory", "/35");
        toddlerSensoryBehavioral.put("Visual", "/30");
        toddlerSensoryBehavioral.put("Touch", "/30");
        toddlerSensoryBehavioral.put("Movement", "/25");
        toddlerSensoryBehavioral.put("Body Position", "/40");
        toddlerSensoryBehavioral.put("Oral", "/35");
        toddlerSensoryBehavioral.put("Behavioral", "/30");
    }
    @GetMapping("EI")
    public String displayEIForm(Model model){
        model.addAttribute("languages", Languages.values());
        model.addAttribute("assessLocation", AssessmentLocation.values());
        model.addAttribute("toddlerSensoryQuadrants",toddlerSensoryQuadrants);
        model.addAttribute("toddlerSensoryBehavioral",toddlerSensoryBehavioral);
        return "forms/EI";
    }
}
