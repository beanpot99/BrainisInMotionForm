package com.brainsInMotion.brainsinmotionforms.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PDFController {
    @GetMapping(value="/completeClinic", produces= MediaType.APPLICATION_PDF_VALUE)
    public @ResponseBody byte[]
    generateReport(@RequestParam(value=""))
}
