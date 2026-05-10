/*
Ex: If the input is:
March 1, 1990
April 2 1995
7/15/20
December 13, 2003
-1

then the output is:
3-1-1990
12-13-2003

getMonthAsInt("February") returns 2 and getMonthAsInt("7/15/20") returns 0.
 */
package cis2900_parsingdates;
import java.util.Scanner;

/**
 *
 * @author jessicahe
 */
public class CIS2900_ParsingDates {

    public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // TODO: Read dates from input, parse the dates to find the ones
      //       in the correct format, and output in m-d-yyyy format
     
     // declare variables
     String userString = "";
     String month = "";
     String day = "";
     String year = "";
     String outputString = "";

     // collect input
     userString = scnr.nextLine();

      // loop
      while(!userString.equals("-1")) {
         // split the input string into 3 parts
         String[] wordParts = userString.split(" ");
         
         if(wordParts.length == 3) {
            month = wordParts[0];
            day = wordParts[1];
            year = wordParts[2];
            // Remove comma from day if present
            day = day.replace(",", "");
            // Convert month to integer using the method
            int monthInt = getMonthAsInt(month);

            // Check if month is valid (1-12) and day is numeric
            if(monthInt != 0) {
               try {
                  // Parse day to make sure it's a valid number
                  int dayInt = Integer.parseInt(day);
                  // Output in m-d-yyyy format
                  System.out.println(monthInt + "-" + dayInt + "-" + year);
               } catch (NumberFormatException e) {
                  // Day is not a number, ignore this date
               }
            }
         }
         
         // Get next input
         userString = scnr.nextLine();
     } //while loop end
   }
    
}
