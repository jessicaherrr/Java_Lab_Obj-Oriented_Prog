

package cis2900_bmicalculator;

import java.text.NumberFormat;
import java.util.Scanner;
/**
 *
 * @author jessicahe
 * input: weight in lbs, height in inches
 * output: BMI value
 */
public class CIS2900_BMICalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double weight;
        double height;
        double bmi;
        final int BMI_CONSTANT = 703;
        
        // create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        //collect weight input
        System.out.println("Please type your weight in lbs:");
        weight = sc.nextDouble();
        System.out.println("Your weight is:" + weight + "lbs.");
        
        //collect height input
        System.out.println("Please type your height in inches:");
        height = sc.nextDouble();
        System.out.println("Your height is:" + height + "inches.");
        
        //calculate BMI value
        bmi = (weight * BMI_CONSTANT) / (height * height);
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        System.out.println("Your BMI value is:" + nf.format(bmi) + ".");
    }
    
}
