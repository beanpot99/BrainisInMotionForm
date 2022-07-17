package com.brainsInMotion.brainsinmotionforms.controllers;


import com.brainsInMotion.brainsinmotionforms.models.ClinicForm;
import com.brainsInMotion.brainsinmotionforms.models.data.ClinicFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="viewAllClinicForms")
public class ListController {
    @Autowired
    private ClinicFormRepository clinicFormRepository;

    @GetMapping("")
    public String displayAllClinicForms(Model model){
    Iterable<ClinicForm> clinicForms = clinicFormRepository.findAll();
    model.addAttribute("clinicForms", clinicForms);
    return "viewAllClinicForms";
    }
}
