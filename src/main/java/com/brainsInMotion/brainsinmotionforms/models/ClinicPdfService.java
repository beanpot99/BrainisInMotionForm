package com.brainsInMotion.brainsinmotionforms.models;

import com.lowagie.text.DocumentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.spring5.SpringTemplateEngine;

import javax.naming.Context;
import java.io.File;
import java.io.IOException;

import static java.awt.TexturePaintContext.getContext;
import org.xhtmlrenderer.pdf.ITextRenderer;

@Service
public class ClinicPdfService {
    private static final String PDF_RESOURCES ="/pdf-resources/";
    private ClinicForm clinicForm;
    private SpringTemplateEngine templateEngine;

    @Autowired
    public ClinicPdfService(ClinicForm clinicForm, SpringTemplateEngine templateEngine){
        this.clinicForm=clinicForm;
        this.templateEngine=templateEngine;
    }
    public File generatePdf() throws IOException {

    }
}
