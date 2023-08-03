/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.yeppooncabinsmenu;

/**
 * Biplav Karki
 * 12205788
 * 2/2/2023
 * YeppoonCabinsMenu class
 * Purpose - to create the Yeppoons Cabins Menu Management System
 */



import java.util.Arrays;
import java.util.Scanner;


public class YeppoonCabinsMenu
{
	final int ENTER_BOOKING = 1;
	final int DISPLAY_BOOKINGS = 2;
	final int DISPLAY_STATISTICS = 3;
	final int SEARCH_BOOKINGS = 4;
	final int SORT_BOOKINGS = 5;
	final int EXIT = 6;
        final int MAX=10;
        private String bookingName;
        private int nightStay;
        Booking book[] = new Booking [MAX];
        private int count = 0;
	
	private int getMenuItem()
	{        

            Scanner inputMenuChoice = new Scanner(System.in); //

            System.out.println("\nPlease select from the following");
            System.out.println(ENTER_BOOKING + ". Enter booking name and number of nights");
            System.out.println(DISPLAY_BOOKINGS + ". Display all booking names, number of nights and charges");
            System.out.println(DISPLAY_STATISTICS + ". Display Statistics");
            System.out.println(SEARCH_BOOKINGS + ". Search for booking");
            System.out.println(SORT_BOOKINGS + ". Sort the bookings");
            System.out.println(EXIT + ". Exit the application");
            System.out.print("Enter choice==> ");

            String choice = inputMenuChoice.nextLine();
            while (choice.equals("") || !isStringNumeric(choice))
            {
                    System.out.println("Error - Menu selection cannot be blank and must be numeric");

                    System.out.print("Enter choice==> ");

                    choice = inputMenuChoice.nextLine();
            }

            return Integer.parseInt(choice);
	}


	private boolean isStringNumeric(String str)
	{
            for (int i = 0; i < str.length(); i++)
            {
                if (!Character.isDigit(str.charAt(i)))
                        return false;
            }

            return true;
	}


	private void processOrders()
	{
            Scanner inputMenuChoice = new Scanner(System.in);

            int choice = getMenuItem();

            while (choice != EXIT)
            {
                switch (choice)
                {
                        case ENTER_BOOKING:
                                enterBooking();
                                break;
                        case DISPLAY_BOOKINGS:
                                displayAllBookings();
                                break;
                        case DISPLAY_STATISTICS:
                                displayStatistics();
                                break;
                        case SEARCH_BOOKINGS:
                                searchBookings();
                                break;
                        case SORT_BOOKINGS:
                                sortBookings();
                                break;
                        default:
                                System.out.println("ERROR choice not recognised");
                }
                choice = getMenuItem();
            }
            
            System.out.println("\nThank you for using the Yeppoon Cabins Management System \nProgram written by 12205788 ");
	}

        //creating enterBooking method to enter the booking name and number of nights 
	private void enterBooking()
	{   
            //user is not able to add more data if there are already 10 datas
            System.out.println("");
             if (count >= 10){
                System.out.printf("Error - maximum bookings to be entered has been reached");
                   return;
               }
             
             int i = count;
             Scanner newScan = new Scanner(System.in); //declaring newScan scanner to store user input
        
             System.out.print("Please enter the booking name ==> ");  // print clear description of entering booking name
             bookingName = newScan.nextLine(); // user input to add booking name
             
             
             //while loop to throw error and re-enter data option if user put empty or number on booking name
             while (bookingName.equals("")||isStringNumeric(bookingName))
             {
                 System.out.println("Error - Booking name cannot be blank or numbers");
                 System.out.printf("\nPlease enter the booking name ==> ");
                 bookingName = newScan.nextLine();
             }
             System.out.println("");
             System.out.print("Please enter the number of night stay ==> ");
             nightStay = newScan.nextInt();
             
             //while loop to throw error and re-enter data option if user put 0 or less than 0
             while (nightStay <= 0 ){
                 System.out.println("Error - Number of nights must be at least 1");
                 System.out.printf("\nPlease enter the number of nights ==> ");
                 nightStay = newScan.nextInt();
             }
             book[i] = new Booking(bookingName, nightStay);
             book[i].calculateCharge();
                      
             count = count + 1;

	     displayHeading();
		
        }
        
        
        //creating displayHeading method to print the recent entered data 
	private void displayHeading()
	{
            //initialising the variable to find the index of the data on the object
            int objectIndex = count - 1;

            System.out.println("Details for booking "+ count + " entered" );
            System.out.printf("%-30s%-11s%-6s\n", "Booking Name ", "Nights ", "Charge ");
            printRecord(book[objectIndex]);
	}
      
        //creating printRecord method to print loop values for booking name, number of nights and charge
        private void printRecord(Booking b)
        {
           System.out.printf("%-30s%-11s",b.getBookingName() , b.getNightsStay());
           System.out.printf("$%.2f \n",b.calculateCharge());
           
        }
        
        //creating displayAllBookings method to display all the items stored in book object
	private void displayAllBookings()
	{
            //throws error if there is no data on the array
           if (count < 1){
               System.out.println("\nError - You must enter at least one booking");
               return;
           }
            System.out.printf("\n\n%-30s%-11s%-6s\n", "Booking Name ", "Nights ", "Charge ");
            for (int i = 0;i < count; i++){
                
                printRecord(book[i]);
            }
            System.out.println("\n");
        }

        //creating displayStatistics method to display all the required statistics
	private void displayStatistics()
	{
            if (count < 1){
                System.out.println("Error - Please enter at least one booking to display statistics");
            return;
            }
            //initialising variables neeeded to calculate statistics
            int shortest = book[0].getNightsStay();
            int minIndex = 0;
            int longest = book[0].getNightsStay();
            int maxIndex = 0;
            double totalNight = 0;
            double average = 0;
            double total = 0;

            //to find index of shortest number of days booked
            for(int i=1; i<count;i++){
                 if(book[i].getNightsStay()<shortest){
                     shortest = book[i].getNightsStay();
                     minIndex = i;
                 }                      
             }
            //to find index of longest number of days booked
             for(int i=1; i<count;i++){
                 if(book[i].getNightsStay()>longest){
                     longest = book[i].getNightsStay();
                     maxIndex = i;
                 }                      
             }
             //to find total number of nights booked
             for(int i = 0; i<count;i++){
                     totalNight += book[i].getNightsStay();
             }
             //to find total charge of the booking made
             for(int i = 0; i<count;i++){
                 total = total+book[i].calculateCharge();
             }
             //calculation to find average number of night booked till now 
             average = totalNight / count;

             System.out.println("\nStatistics for Yeppoon Cabins");
             System.out.println(book[maxIndex].getBookingName() +" has the maximum number of "+ book[maxIndex].getNightsStay() +" nights ");
             System.out.println(book[minIndex].getBookingName() +" has the minimum number of "+ book[minIndex].getNightsStay() +" nights");
             System.out.printf("Average number of nights per bookings is %.2f", average );
             System.out.printf("\nThe  total charges are $%.2f\n",  total);

	}

        // creating searchBookings method to search the item stored in object exists or not
	private void searchBookings()
	{
            if (count < 1){
                System.out.println("Error - Please enter at least one booking to search");
            return;
            }
            System.out.print("Please enter the booking name: ");
            Scanner scan = new Scanner(System.in);
            String search = scan.nextLine();
            boolean flag = false;
            for(int i = 0; i < count;i++){
                //checks if recent user input value match with the data which are already there 
                if(book[i].getBookingName().equalsIgnoreCase(search)){
                    System.out.println("\nBooking Found");
                    System.out.printf("%-30s%-11s%-6s\n", "Booking Name ", "Nights ", "Charge ");
                    printRecord(book[i]);
                    flag = true;
                    break;
                }
                else{
                    
                    flag = false;
                }
            }
            if(flag == false){

                System.out.println(search + " not found");
                return;

            }
	}

        //creating sortBookings method to sort items stored in Bookings object alphabetically
	private void sortBookings()
	{
            if (count < 2){
               System.out.println("\nError - You must enter at least two booking to sort");
               getMenuItem();
           }
            //implementing for loops to compare the values which are stored in array to find small one 
            for(int i = 0;i < count - 1 ;i++){
                int index = i;
                for(int j = i + 1; j < count; j++){
                    if(book[j].getBookingName().compareToIgnoreCase(book[index].getBookingName()) < 0){
                        index = j;
                    }
                }
                Booking small = book[index];
                book[index] = book[i];
                book[i] = small;
                
            }
                System.out.printf("%-30s%-11s%-6s\n", "Booking Name: ", "Nights: ", "Charge: ");
                for(int i = 0;i < count;i++){
                  printRecord(book[i]);
                }
	}


	public static void main(String [] args)
	{
                System.out.println("Welcome to the Yeppoon Cabins Management System");
		YeppoonCabinsMenu app = new YeppoonCabinsMenu();

		app.processOrders();
	}
}


