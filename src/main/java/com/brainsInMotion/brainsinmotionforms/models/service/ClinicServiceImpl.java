package com.brainsInMotion.brainsinmotionforms.models.service;

import com.brainsInMotion.brainsinmotionforms.models.ClinicForm;
import com.brainsInMotion.brainsinmotionforms.models.data.ClinicFormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClinicServiceImpl implements ClinicFormService{
    @Autowired
    private ClinicFormRepository clinicFormRepository;
    @Override
    public List<ClinicForm> getAllClinicForms(){
        return (List<ClinicForm>) clinicFormRepository.findAll();
    }
}
