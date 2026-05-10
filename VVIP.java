package vvip;
import java.util.Scanner;

public class VVIP {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        char userType;
        double orderValue;
        
        userType = scnr.next().charAt(0);
        orderValue = scnr.nextDouble();
        
        if (userType == 'v') {
            System.out.println("VVIP");
        }
        else if (userType == 'c') {
            if ((orderValue >= 8000)) {
                System.out.println("VIP");
            }
            else if (orderValue >= 5000 && orderValue < 8000) {
                System.out.println("Star"); 
            }
            else if (orderValue < 5000) {
                System.out.println("Regular");
            }
        }
        else if (userType == 'o') {
            System.out.println("Other");
        }
    }
}