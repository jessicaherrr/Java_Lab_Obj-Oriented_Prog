
package spring26chapter13example;

import java.util.Scanner;

public class Spring26Chapter13Example {

    public static void main(String[] args) {

        //The codes below will make sure we get a valid integer between 1 and 150
        //print prompt
        System.out.println("Please type your age");
        
        Scanner sc = new Scanner(System.in);
        
        int age = 0;
        boolean isValidInteger = false;//indicates if our input entry is a number
        boolean isValidRange = false; //indicates if our input entry is in the right range
        
        while(!(isValidInteger==true && isValidRange ==true))
        {
            try {
                //statements may throw an exception should be in try block

                //take input entry from user
                age = sc.nextInt();//may throw an exception
                //System.out.println("after nextint()");//will be skipped if an exception is thrown
                isValidInteger = true;
            } catch (Exception e) {
                sc.next();//discard the incorrecly entered value from the pipe
                //statements to handle exceptions
                System.out.println(e);
                System.out.println("Please type a whole number, try again ");
            }

            //if it is an integer
            if (isValidInteger) {
                //start to determine if it is in the right range [1, 150]
                if (age < 1 || age > 150) {
                    System.out.println("Invalid, you typed a number but please type a number again between 1 and 150");
                    isValidInteger = false;
                    
                } else {
                    System.out.println("Valid, Your age is " + age);
                    isValidRange = true;//we have the valid range entry
                }

            }
        }//end of while loop
        
        
    }
    
    
}
