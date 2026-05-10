
package cis2900sortanarray;

import java.util.Scanner;

/*
Ex: If the input is:
5 10 4 39 12 2

the output is:
39,12,10,4,2,
 */
public class CIS2900SortAnArray {

    public static void sortArray(int[] myArr) {
      int n = myArr.length;
      
      // Bubble sort for descending order
      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            // Swap if current element is less than next element (for descending order)
            if (myArr[j] < myArr[j + 1]) {
               int temp = myArr[j];
               myArr[j] = myArr[j + 1];
               myArr[j + 1] = temp;
            }
         }
      }
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numElements = scnr.nextInt();
      int[] numbers = new int[numElements];
      
      for (int i = 0; i < numElements; i++) {
         numbers[i] = scnr.nextInt();
      }

      sortArray(numbers);

      for (int i = 0; i < numbers.length; i++) {
         System.out.print(numbers[i] + ",");
      }
      System.out.println();
   }
    
}
