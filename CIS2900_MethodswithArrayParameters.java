package cis2900_methodswitharrayparameters;
import java.util.Scanner;

public class CIS2900_MethodswithArrayParameters {

   // Method: Adds updateVal to each element of the array
   // The array parameter (scoreVals) is a reference to the original array
   // So changes to array elements affect the original array
   public static void updateScoreVals(int[] scoreVals, int updateVal) {
      int i;

      // Loop through each array element
      for (i = 0; i < scoreVals.length; ++i) {
          // Modify the actual array element (this changes the original array)
          scoreVals[i] = scoreVals[i] + updateVal;
      }
   }
   
   // Method: Prints all elements of the array
   public static void printScoreVals(int[] scoreVals) {
       int i;

       for (i = 0; i < scoreVals.length; ++i) {
           System.out.println(scoreVals[i]);
       }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_SCORES = 3;        // Array size
      int[] quizScores = new int[NUM_SCORES];  // Create array
      int scoreUpdate = 5;              // Value to add
      int i;


      System.out.println("Enter " + NUM_SCORES + " scores:");
      for (i = 0; i < quizScores.length; ++i) {
          quizScores[i] = scnr.nextInt();
      }

      // Call method to add 5 to each score
      // The array reference is passed, so original array will be modified
      updateScoreVals(quizScores, scoreUpdate);
      
      // Print the updated array
      System.out.println("Updated scores:");
      printScoreVals(quizScores);
   }
}
