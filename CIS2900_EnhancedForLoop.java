
package cis2900_enhancedforloop;
import java.util.Scanner;
import java.util.ArrayList;

public class CIS2900_EnhancedForLoop {
   
   // Generic method - works with ANY type of ArrayList
   // <T> declares a type parameter; T can be Character, String, Integer, etc.
   public static <T> void printSurnames(ArrayList<T> surnamesList) {
      // Enhanced for loop (for-each) - goes through each element
      // var automatically infers the type (same as T here)
      for (var surName : surnamesList) {
         System.out.println(surName + " is an element");
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // var: compiler figures out this is ArrayList<Character>
      var surnameInitials = new ArrayList<Character>();
      
      // var: compiler figures out this is ArrayList<String>
      var surnameStrings = new ArrayList<String>();
      
      int numSize;  // number of elements to read
      int i;        // loop counter

      // Read how many items
      numSize = scnr.nextInt();
      
      // Read characters (first letters) into surnameInitials
      for (i = 0; i < numSize; ++i) {
         // next() reads a String, charAt(0) takes the first character
         surnameInitials.add(scnr.next().charAt(0));
      }
      
      // Read full strings into surnameStrings
      for (i = 0; i < numSize; ++i) {
         surnameStrings.add(scnr.next());
      }
      
      // Call the generic method with Character ArrayList
      printSurnames(surnameInitials);
      
      // Call the same generic method with String ArrayList
      printSurnames(surnameStrings);
      
      scnr.close();  // good practice to close Scanner
   }
}
    
