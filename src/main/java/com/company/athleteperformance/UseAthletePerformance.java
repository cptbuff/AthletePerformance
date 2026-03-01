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
        int count = 0;
        
        try { //  try the below block of code
            reader = new BufferedReader(new FileReader(file)); // read variable file

            while ((line = reader.readLine()) != null) { // assign line read by reader to line. While line read is not blank...
                String[] parts = line.split(","); // assign to  array named parts and remove commas
                
                for (String index : parts) { // assign
                    System.out.printf("%-15s", index);
                    count++;

                    if (count % 7 == 0) {
                        System.out.println();
                    }
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