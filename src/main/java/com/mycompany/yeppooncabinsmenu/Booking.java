/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.yeppooncabinsmenu;

import java.util.Scanner;

/**
 * Biplav Karki
 * 12205788
 * 2/2/2023
 * Booking class
 * Purpose - to create booking object for the system
 */
public class Booking {
    
    //initialising required variables
    private String bookingName;
    private int nightsStay;
    final int cleanCharge = 20; 
    final double rate = 89.95;
    
    //creating default constructor to add default values for name and number of nights
    public Booking(){       
        bookingName = "";
        nightsStay = 1;
    }
    
    //creating parameterised constructor for name and number of nights
    public Booking(String name, int nights){
        this.bookingName = name;
        this.nightsStay = nights;
    }
    
    // creating get method to get name for booking made
    public String getBookingName(){
        return bookingName;
    }
    
    // creating get method to get number of nights for booking made
    public int getNightsStay(){
    return nightsStay;
    }
    
    // creating set method to set number of nights for booking made
    public void setNightsStay(int nights){
        this.nightsStay = nights;
        
    }
    // creating set method to set name for booking made
    public void setBookingName(String name){
    this.bookingName = name;
    }
   
    
    //creating calculateCharge method to display statistic and calculate charges of bookings made
    public double calculateCharge(){
        
        double finalCharge = nightsStay * rate + cleanCharge;
        if (nightsStay > 10)
        {
            finalCharge = ((rate * nightsStay)- 0.15 * (rate * nightsStay) + cleanCharge);
            return finalCharge;
        }
         else if(nightsStay > 7){
            finalCharge = ((rate * nightsStay)- 0.1 * (rate * nightsStay) + cleanCharge);
            return finalCharge;
        }
        return finalCharge;
    }
   
}

