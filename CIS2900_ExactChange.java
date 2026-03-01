/*
* Write a program with total change amount in pennies as an integer input, 
* and output the change using the fewest coins, 
* one coin type per line. 
* The coin types are Dollars, Quarters, Dimes, Nickels, and Pennies. 
* Use singular and plural coin names as appropriate, like 1 Penny vs. 2 Pennies.
*/
package cis2900_exactchange;
import java.util.Scanner; 

public class CIS2900_ExactChange {

    public static void main(String[] args) {
      int pennyChangeAmount;
      int dollars;
      int quarters;
      int dimes;
      int nickels;
      int pennies;

      Scanner sc = new Scanner(System.in);
      pennyChangeAmount = sc.nextInt();

      if (pennyChangeAmount == 0) {
         System.out.println("No change");
      }
      else {
         // Calculate number of each coin type
         dollars = pennyChangeAmount / 100;
         int remaining = pennyChangeAmount % 100;
         
         quarters = remaining / 25;
         remaining = remaining % 25;
         
         dimes = remaining / 10;
         remaining = remaining % 10;
         
         nickels = remaining / 5;
         remaining = remaining % 5;
         
         pennies = remaining;
         
         // Output dollars
         if (dollars > 0) {
            if (dollars == 1) {
               System.out.println("1 Dollar");
            }
            else {
               System.out.println(dollars + " Dollars");
            }
         }
         
         // Output quarters
         if (quarters > 0) {
            if (quarters == 1) {
               System.out.println("1 Quarter");
            }
            else {
               System.out.println(quarters + " Quarters");
            }
         }
         
         // Output dimes
         if (dimes > 0) {
            if (dimes == 1) {
               System.out.println("1 Dime");
            }
            else {
               System.out.println(dimes + " Dimes");
            }
         }
         
         // Output nickels
         if (nickels > 0) {
            if (nickels == 1) {
               System.out.println("1 Nickel");
            }
            else {
               System.out.println(nickels + " Nickels");
            }
         }
         
         // Output pennies
         if (pennies > 0) {
            if (pennies == 1) {
               System.out.println("1 Penny");
            }
            else {
               System.out.println(pennies + " Pennies");
            }
         }
      }
        
              
    }
    
}
