package com.brainsInMotion.brainsinmotionforms.controllers;

import com.brainsInMotion.brainsinmotionforms.models.CommunicationStatus;
import com.brainsInMotion.brainsinmotionforms.models.EducationLevel;
import com.brainsInMotion.brainsinmotionforms.models.Therapist;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("forms")
public class ClinicController {


    @GetMapping("clinic")
    public String displayClinicForm(Model model){
    model.addAttribute("educationLevel", EducationLevel.values());
    model.addAttribute("communicationLevel", CommunicationStatus.values());
        return "forms/clinic";
    }
    @PostMapping(value="clinic/{therapistName}")
    public String autoFillTherapist(Model model, @PathVariable String therapistName){
        ArrayList<Therapist> therapists=new ArrayList<>();
        Therapist kristi = new Therapist("Kristi Warren","MOT,OT/L","OT","217-891-1524","C:\\Users\\16185\\Desktop\\LC-Projects\\Java\\brains-in-motion-forms\\src\\main\\resources\\static\\images");
        Therapist newTherapist = new Therapist("New lady", "MOT,OT/L", "OT","217-555-5555","uncreated");
        if(therapistName=="kristi" ){
            therapists.add(kristi);
            model.addAttribute("therapist",therapists);
        }else {
            therapists.add(newTherapist);
            model.addAttribute("therapist",therapists);
        }
        return "clinic";
    }
}
