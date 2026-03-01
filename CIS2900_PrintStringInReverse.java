
package cis2900_printstringinreverse;
import java.util.Scanner;

/*
Ex: If the input is:
Hello there
Hey
done

the output is:
ereht olleH
yeH

 */
public class CIS2900_PrintStringInReverse {

    public static void main(String[] args) {
      Scanner sn = new Scanner(System.in);
      String inputStr; //It should be string instead of char
      int i;

      inputStr = sn.nextLine(); // nextLine() reads the whole line
         
      while (!(inputStr.equals("Done") || inputStr.equals("done") || inputStr.equals("d"))) {
         // equals() compares strings
         //while(!inputStr.equals("Done") && !inputStr.equals("done") && !inputStr.equals("d"))
         for (i = inputStr.length() - 1; i >= 0; i --) {
            System.out.print(inputStr.charAt(i));
         }

         System.out.println();
         // update -- read next input string
         inputStr = sn.nextLine();
      } 
   }
    
}
