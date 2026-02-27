package com.company.athleteperformance;

/**
 *
 * @author francis
 */
public class AthletePerformance {
    
    private String name; // create name variable. Made private for security
    private float runTime; // create 100m run time variable. Made private for security
    private int pushups; // create pushups variable. Made private for security
    private int situps; // create situps variable. Made private for security
    private int vJump; // create vertical jump variable. Made private for security
    private int shuttleRun; // create shuttle run variable. Made private for security
    private int plankTime; // create plank time variable. Made private for security
    
    AthletePerformance() {
        
    }
    
    AthletePerformance(String name, float runTime, int pushups, int situps, int vJump, int shuttleRun, int plankTime) { // create AthletePerformance constructor
        this.name = name; // assign name value to name
        this.runTime = runTime; // assign runTime value to runTime
        this.pushups = pushups; // assign pushups value to pushups
        this.situps = situps; // assign situps value to situps
        this.vJump = vJump; // assign vJump value to vJump
        this.shuttleRun = shuttleRun; // assign shuttleRun value to shuttleRun
        this.plankTime = plankTime; // assing plankTime value to plankTime
    }
    
// =============================== Setters Below ===============================
    void setName() { // setter for name
        this.name = name;
    }
    
    void setRunTime() { // setter for 100m run time
        this.runTime = runTime;
    }
    
    void setPushups() { // setter for pushups
        this.pushups = pushups;
    }
    
    void setSitups() { // setter for situps
        this.situps = situps;
    }
    
    void setVertJump() { // setter for vertical jump
        this.vJump = vJump;
    }
    
    void setShuttleRun() { // setter for shuttle run
        this.shuttleRun = shuttleRun;
    }
    
    void setPlankTime() { // setter for plank time
        this.plankTime = plankTime;
    }
    
// =============================== Getters Below ===============================

    String getName(String name) { // getter for name
        return name;
    }
    
    float getRunTime(float runTime) { // getter for 100m run time
        return runTime;
    }
    
    int getPushups(int pushups) { // getter for pushups
        return pushups;
    }
    
    int getSitups(int situps) { // getter for situps
        return situps;
    }
    
    int getVertJump(int vJump) {  // getter for vertical jump
        return vJump;
    }
    
    int getShuttleRun(int shuttleRun) { // getter for shuttle run
        return shuttleRun;
    }
    
    int getPlankTime(int plankTime) { // getter for plank time
        return plankTime;
    }
    
    
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