package com.brainsInMotion.brainsinmotionforms.controllers;

import com.brainsInMotion.brainsinmotionforms.models.*;
import com.brainsInMotion.brainsinmotionforms.models.clinicEnums.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("forms")
public class ClinicController {
    static HashMap<String, String> childSensoryTwoCategories = new HashMap<>();
    public ClinicController(){
        childSensoryTwoCategories.put("Seeking/Seeker","/95");
        childSensoryTwoCategories.put("Avoiding/Avoider","/100");
        childSensoryTwoCategories.put("Sensitivity/Sensor","/95");
        childSensoryTwoCategories.put("Registration/Bystander","/110");
        childSensoryTwoCategories.put("Auditory","/40");
        childSensoryTwoCategories.put("Visual","/30");
        childSensoryTwoCategories.put("Touch","/55");
        childSensoryTwoCategories.put("Movement","/40");
        childSensoryTwoCategories.put("Body Position","/40");
        childSensoryTwoCategories.put("Oral","/50");
        childSensoryTwoCategories.put("Conduct","/45");
        childSensoryTwoCategories.put("Social Emotional","/70");
        childSensoryTwoCategories.put("Attentional","/50");
    }
    @GetMapping("clinic")
    public String displayClinicForm(Model model){
    model.addAttribute("educationLevel", EducationLevel.values());
    model.addAttribute("communicationLevel", CommunicationStatus.values());
    model.addAttribute("assessmentMethod", AssessmentMethod.values());
    model.addAttribute("behaviorObservations", BehaviorObservations.values());
    model.addAttribute("fineMotor", FineMotor.values());
    model.addAttribute("strengthAndRangeOfMotion", StrengthRangeOfMotion.values());
    model.addAttribute("childSensoryTwoCategories", childSensoryTwoCategories);
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
