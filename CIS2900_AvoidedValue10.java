
package cis2900_avoidedvalue10;
import java.util.Scanner;
/*

 */
public class CIS2900_AvoidedValue10 {

   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      boolean avoidedValue;
      int inputCount;
      int i;
      int val;

      avoidedValue = true;
      inputCount = scnr.nextInt();
   
      for (i = 0; i < inputCount; i ++) {
         val = scnr.nextInt();
         if (val == 10) { // we don't need a statement if (val != 10 ) {avoidedValue = true;} cuz this'll overwrite the false statement if there is a 10
            avoidedValue = false;
         }
      }
      

      if (avoidedValue) {
         System.out.println("Avoided 10");
      }
      else {
         System.out.println("Has one or more copies of 10");
      }

   }
}  
