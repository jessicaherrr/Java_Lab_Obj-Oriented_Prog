
package cis2900_myfirstproject;
import java.util.Scanner;
/**
 *
 * @author jessicahe
 */

public class CIS2900_MyFirstProject {

    /**
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {//start of main method
        //declare variables
        String firstName;
        String lastName;
        String fullName;
        int userAge;
  
        //create a Scanner object(scnr, sc or input...) as a tool to take inputs from users
        Scanner input = new Scanner(System.in); //input is a variable name
        
        //first name
        System.out.println("Please type your first name");
        firstName = input.next();//next() reads the next token(word) from the input(keyboard)
        System.out.println("Your first name is:  " + firstName);
        
        //last name
        System.out.println("Please type your last name");
        lastName = input.next();//next() reads the next token(word) from the input(keyboard)
        System.out.println("Your last name is:  " + lastName);
        
        //combined full name
        System.out.println("Your combined full name is: " + firstName + " " + lastName);
        
        input.nextLine();
        
        //full name
        System.out.println("Please type your full name");
        fullName = input.nextLine();//nextIine reads next whole string
        System.out.println("Your full name is: " + fullName);
        
        
        //age--Integer
        System.out.println("Please type your age");
        userAge = input.nextInt();//nextInt reads next whole number
        System.out.println("Your age is: " + userAge);       
    }//end of main method
    
}



   


