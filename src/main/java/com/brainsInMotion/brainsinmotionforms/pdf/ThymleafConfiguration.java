package com.brainsInMotion.brainsinmotionforms.pdf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

public class ThymleafConfiguration {


    @Configuration
    public class ThymeleafConfiguration {

        @Bean
        public ClassLoaderTemplateResolver emailTemplateResolver() {
            ClassLoaderTemplateResolver pdfTemplateResolver = new ClassLoaderTemplateResolver();
            pdfTemplateResolver.setPrefix("pdf-templates/");
            pdfTemplateResolver.setSuffix(".html");
            pdfTemplateResolver.setTemplateMode("HTML5");
            pdfTemplateResolver.setCharacterEncoding("UTF-8");
            pdfTemplateResolver.setOrder(1);
            return pdfTemplateResolver;
        }

    }
}
