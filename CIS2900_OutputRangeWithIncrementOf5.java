package cis2900_outputrangewithincrementof5;
import java.util.Scanner;

/*
Ex: If the input is:
-15 10
the output is:
-15 -10 -5 0 5 10

Ex: If the second integer is less than the first as in:
20 5
the output is:
Second integer can't be less than the first.
*/
public class CIS2900_OutputRangeWithIncrementOf5 {

    public static void main(String[] args) {
      int int1;
      int int2;
      Scanner sc = new Scanner(System.in);

      int1 = sc.nextInt();
      int2 = sc.nextInt();
      if (int1 <= int2) {
         for (int i = int1; i <= int2; i = i + 5){
            System.out.print(i + " ");  // output i
         }
         System.out.println();
      }
      else {
         System.out.println("Second integer can't be less than the first.");
      }
   }
    
}

