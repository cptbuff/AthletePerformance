package com.company.athleteperformance;

import java.util.*; // astrisk imports all classes from util and io. Used to reduce number of lines
import java.io.*;

/**
 *
 * @author francis
 */
public class UseAthletePerformance {

    public static void main(String[] args) {
        
        String file = "src/main/java/com/company/athleteperformance/athletes.csv";
        BufferedReader reader = null;
        String line = "";
        
        try {
            reader = new BufferedReader(new FileReader(file));

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                
                for (String index : parts) {
                    System.out.printf("%-10s", index);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
}

//Load athlete data from a CSV file 
//
//    Use BufferedReader and InputStreamReader 
//
//    Read from athletes.csv located in project (myCode) resources 
//
//    Skip header row 
//
//Parse each line of the CSV 
//
//    Split by commas 
//
//    Validate that each row contains 7 values 
//
//    Extract athlete name 
//
//    Convert remaining values to doubles and store in an array 
//
//Create AthletePerformance objects 
//
//    Use the full constructor 
//
//    Add each object to a list of athletes 
//
//Display each athlete’s results 
//
//    Loop through the list 
//
//    Call displayResults() for each athlete 
//
//Calculate group statistics 
//
//    Track highest performer 
//
//    Track lowest performer 
//
//    Accumulate total points for average calculation across all athletes 
//
//Compute and print summary 
//
//    Print top performer name + score 
//
//    Print lowest performer name + score 
//
//    Print average score across all athletes 