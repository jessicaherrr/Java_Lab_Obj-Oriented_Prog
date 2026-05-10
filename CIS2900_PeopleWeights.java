package cis2900_peopleweights;

import java.util.Scanner;

/*
Enter weight 1:
236.0
Enter weight 2:
89.5
Enter weight 3:
142.0
Enter weight 4:
166.4
Enter weight 5:
93.0
You entered: 236.0 89.5 142.0 166.4 93.0 

Total weight: 726.9
Average weight: 145.38
Max weight: 236.0
 */
public class CIS2900_PeopleWeights {


    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Get the number of weights from user
      System.out.print("Enter the number of people: ");
      int numPeople = scnr.nextInt();
      
      // Create array with user-defined size
      double[] pplWeight = new double[numPeople];
      
      // Input weights
      for (int i = 0; i < numPeople; ++i) {
         System.out.println("Enter weight " + (i + 1) + ":");
         pplWeight[i] = scnr.nextDouble();
      }
      
      // Display entered weights
      System.out.print("You entered: ");
      for (int i = 0; i < numPeople; ++i) {
         System.out.print(pplWeight[i] + " ");
      }
      System.out.println("\n");
      
      // Calculate total weight
      double total = 0;
      for (int i = 0; i < numPeople; ++i) {
         total += pplWeight[i];  // Using += operator for brevity
      }
      System.out.println("Total weight: " + total);
      
      // Calculate average weight
      double average = total / numPeople;
      System.out.println("Average weight: " + average);
      
      // Find maximum weight
      double max = pplWeight[0];
      for (int i = 1; i < numPeople; ++i) {  // Start from index 1
         if (pplWeight[i] > max) {
            max = pplWeight[i];
         }
      }
      System.out.println("Max weight: " + max);
      
   }
    
}
