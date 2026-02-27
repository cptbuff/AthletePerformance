package com.company.athleteperformance;

/**
 *
 * @author francis
 */
public class AthletePerformance {
    
}

//Store athlete information 
//
//    Athlete name 
//
//    Raw fitness‑event scores.  
//
//    Converted fitness‑point values for each event.  
//
//Provide constructors 
//
//    Modified full constructor that accepts name + raw scores  
//
//Convert raw event scores into fitness points “convertScoresToPoints()” 
//
//    Loop through all raw scores 
//
//    For each event, call a scoring method. Take the raw score for the event, convert it into points using scoreToPoints method, and store the result. 
//
//Provide a method to convert a single score “scoreToPoints()” 
//
//  Use event index to determine scoring rules 
//
//    Event Index 
//
//      0 = Run100m (lower is better) 
//
//      1 = Pushups (higher is better) 
//
//      2 = Situps (higher is better) 
//
//      3 = VerticalJump (higher is better) 
//
    //    4 = ShuttleRun (lower is better) 
    //
    //    5 = PlankTime (higher is better) 
//
//    Return a point value (50–100) based on thresholds. 
//
//    Look at the highest and lowest score in each event. Devise a system to return 100 points to the highest score and 50 or 60 points to the lowest score, distributing the remaining points across the remaining scores. 
//
//Calculate total points 
//
//    Sort it in ascending order 
//
//    Add the highest four values to produce the athlete’s total score 
//
//Determine performance tier 
//
//    Elite: total ≥ 360 
//
//    Intermediate: total ≥ 260 
//
//    Beginner: below 260 
//
//Display results 
//
//    Print athlete name 
//
//    Print total points 
//
//    Print performance tier