//package com.brainsInMotion.brainsinmotionforms.data.SensoryProfile;
//
//import com.brainsInMotion.brainsinmotionforms.models.*;
//import org.apache.commons.csv.CSVFormat;
//import org.apache.commons.csv.CSVParser;
//import org.apache.commons.csv.CSVRecord;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
//
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.Reader;
//import java.util.ArrayList;
//import java.util.List;
//
//
//
//public class QuestionData {
//    private static final String DATA_FILE = "testerCSVFile.csv";
//    private static Boolean isDataLoaded = false;
//    private static ArrayList<Question> allQuestions;
//    private static ArrayList<Points> allPoints;
//    private static ArrayList<IndividualQuestion> allIndividualQuestions;
//    private static ArrayList<Quadrant> allQuadrants;
//    private static ArrayList<Section> allSections;
//
//    private static void loadQuestions(){
//        if (isDataLoaded) {
//            return;
//        }
//
//        try {
//
//            // Open the CSV file and set up pull out column header info and records
//            Resource resource = new ClassPathResource(DATA_FILE);
//            InputStream is = resource.getInputStream();
//            Reader reader = new InputStreamReader(is);
//            CSVParser parser = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(reader);
//            List<CSVRecord> records = parser.getRecords();
//            Integer numberOfColumns = records.get(0).size();
//            String[] headers = parser.getHeaderMap().keySet().toArray(new String[numberOfColumns]);
//
//            allQuestions = new ArrayList<>();
//            for(CSVRecord record:records){
//                String aQuestion = record.get(0);
//                String aPoint = record.get(1);
//                String aQuadrant = record.get(2);
//                String aSection = record.get(3);
//
//                Points newPoints = (Points) findExistingObject(allPoints, aPoint);
//            }
//}
