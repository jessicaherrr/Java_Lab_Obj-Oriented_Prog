package cis2900_secretstringdigitcounting;
import java.util.Scanner;

/*
String secretStr is read from input. 
For each character in secretStr that is a digit, 
increment count by 1. 
Then, output "Valid" if count contains at least 2 digits 
and secretStr's length is greater than 4. 
Otherwise, output "Invalid". End each output with a newline.
 */
public class CIS2900_SecretStringDigitCounting {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String secretStr;
      int i;
      int count;
      
      secretStr = scnr.next();
      count = 0;

      for (i = 0; i < secretStr.length(); i ++) {
         if (Character.isDigit(secretStr.charAt(i)) == true) { // Character.isDigit() returns true if a character is a digit, and false otherwise. Ex: Character.isDigit('8') returns true. Character.isDigit('a') returns false.
            count = count + 1;
         }   
      }   
      if (count >= 2 && secretStr.length() > 4) {
         System.out.println("Valid");
      }
      else {
         System.out.println("Invalid");
      }
      

   }    
}
