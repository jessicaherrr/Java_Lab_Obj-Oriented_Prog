package cis2900_menusystem;

import java.util.Scanner;

/*
Ex:
Today's Menu:
   1) Gumbo
   2) Jambalaya
   3) Quit

Enter choice: 1 
Order: Gumbo

Today's Menu:
   1) Gumbo
   2) Jambalaya
   3) Quit

Enter choice: 3 
Goodbye
 */
public class CIS2900_MenuSystem {

    public static void printMenu() {
      System.out.println("Today's Menu:");
      System.out.println("   1) Gumbo");
      System.out.println("   2) Jambalaya");
      System.out.println("   3) Quit\n");
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      boolean quit = false;
      int choice;

      while (!quit) {
         printMenu();
         System.out.print("Enter choice: ");
         choice = scnr.nextInt(); 
         if (choice == 3) {
            System.out.println("Goodbye");
            quit = true;
         }
         else {
            System.out.print("Order: ");
            if (choice == 1) {
               System.out.println("Gumbo");
            }
            else if (choice == 2) {
               System.out.println("Jambalaya");
            }
            System.out.println();
         }  
      }  
   }
    
}
