package com.brainsInMotion.brainsinmotionforms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.thymeleaf.TemplateEngine;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.thymeleaf.context.Context;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;


@Component
    public class PdfGeneratorUtil {

        @Autowired
        private TemplateEngine templateEngine;
        public String createPdf(String templateName, Map map) throws Exception {
            Assert.notNull(templateName, "The templateName can not be null");
           Context ctx = new Context();
            if (map != null) {
                Iterator itMap = map.entrySet().iterator();
                while (itMap.hasNext()) {
                    Map.Entry pair = (Map.Entry) itMap.next();
                    ctx.setVariable(pair.getKey().toString(), pair.getValue());
                }
            }

            String processedHtml = templateEngine.process(templateName, ctx);
            FileOutputStream os = null;
            String fileName = UUID.randomUUID().toString();
            try {
                final File outputFile = File.createTempFile(fileName, ".pdf");
                System.out.println(outputFile.getAbsolutePath());
                os = new FileOutputStream(outputFile);

                ITextRenderer renderer = new ITextRenderer();
                renderer.setDocumentFromString(processedHtml);
                renderer.layout();
                renderer.createPDF(os, false);
                renderer.finishPDF();
                System.out.println("PDF created successfully");
            }
            finally {
                if (os != null) {
                    try {
                        os.close();
                    } catch (IOException e) { /*ignore*/ }
                }
            }
            return processedHtml;
        }
    }



