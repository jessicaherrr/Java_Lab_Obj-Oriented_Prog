
package cis2900_salarycalculation;
import java.util.Scanner;

/*
 * @author jessicahe
 * Salary Calculation Application
 * Inputs: hourlyWage, hoursWeek,weeksYear
 * Outputs: Annual Salary, Monthly Salary
 */
public class CIS2900_SalaryCalculation { //start of class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hourlyWage;
        int hoursWeek, weeksYear;
        
        Scanner sc = new Scanner(System.in);
        
        //hourlyWage
        System.out.println("Please type your hourlyWage: ");
        hourlyWage = sc.nextDouble();
        System.out.println("HourlyWage is: " + hourlyWage);
        
        //hoursWeek
        System.out.println("Please type your hoursWeek: ");
        hoursWeek = sc.nextInt();
        System.out.println("HoursWeek is: " + hoursWeek);
        
        //weeksYear
        System.out.println("Please type your weeksYear: ");
        weeksYear = sc.nextInt();
        System.out.println("WeeksYear is: " + weeksYear);
        
        
        //calculation
        double annualSalary = hourlyWage * hoursWeek * weeksYear;
        System.out.println("Your annual salary is: " + annualSalary);
        
        double monthlySalary = annualSalary / 12;
        System.out.println("Your monthly salary is: " + monthlySalary);
        
    }
    
} //end of class
