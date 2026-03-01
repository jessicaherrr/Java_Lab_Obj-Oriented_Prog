
package cis2900_nestedloopscinemaseats;
import java.util.Scanner;

/*
In Val's cinema, each seat is labeled with a letter followed by an integer. 
Given integers numRows and numColumns, 
output the label for each seat, followed by a space. 
End each row with a newline.
Ex: If the input is 2 4, then the output is:
A1 A2 A3 A4 
B1 B2 B3 B4 

 */
public class CIS2900_NestedLoopsCinemaSeats {

    public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      char currentRowLetter;
      int currentColumn;
      int currentColumnInteger;
   
      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();
      
      for (currentRow = 0; currentRow < numRows; currentRow ++) {
         currentRowLetter = (char) ('A' + currentRow); // char and int will print int
         for (currentColumn = 0; currentColumn < numColumns; currentColumn ++) {
            currentColumnInteger = 1 + currentColumn;
            
            System.out.print(currentRowLetter + "" + currentColumnInteger + " "); // we need "" between char and integer
            
         }
         System.out.println();
      }

   }
}
