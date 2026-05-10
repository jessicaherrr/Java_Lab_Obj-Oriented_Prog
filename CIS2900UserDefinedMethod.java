package cis2900userdefinedmethod;
import java.util.Random;

public class CIS2900UserDefinedMethod {

    //Methods with No Parameters and No Return Value
    public static void printsWelcome() {
        System.out.println("Welcome to this example");
        System.out.println("A Java method is a collection of statements"
        + "that are grouped together to perform an operation");
    }
    
    //Methods with No Parameters and a Return Value
    public static String getGreetingMsg() {
        return "Hello, welcome to Java!";
    }
    
    //Methods with No Parameters and a Return Value
    public static int generateRandomNumber() {
        Random random = new Random();
        // Generate a random integer between 0 and 100
        return random.nextInt(101);
    }
    
    //Methods with Parameters and No Return Value
    public static void printSum(int a, int b) {
        int sum = a + b; // Add the two numbers
        System.out.println("The sum is: " + sum); // Print the sum, no return value
    }
    
    //Methods with Parameters and No Return Value
    public static void printArrayValues(int[] arr, int size) {
    // Iterate over the array and print each value
        for (int i = 0; i < size; i++) {
        System.out.println(arr[i]); // Print each element of the array
        }
    }
    
    //Methods with Parameters and a Return Value
    public static int normalizeGrade(int grade) {
        int upperBound = 78;
        int lowerBound = 52;
        if (grade > upperBound) {
            return upperBound;
        } 
        else if (grade <= lowerBound) {
            return lowerBound;
        } 
        else {
            return grade;
        }
    }
    
    public static int compute(int val1, int val2) {
        int result = 0;
        for (int i = 0; i < val1; ++i) {
            result += val2 * 2;
        }
        return result;
    }
    
    // Exercise 1: Method with Parameters and No Return Value
    // Prints student information
    public static void printStudentInfo(String name, int id, double gpa, String major) {
        System.out.println("=== Student Information ===");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("GPA: " + String.format("%.2f", gpa));
        System.out.println("Major: " + major);
        System.out.println("===========================");
    }
    
    // Exercise 2: Method with Parameters and a Return Value
    // Calculates the average of an array of integers
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0.0; // Return 0 if array is null or empty
        }
        
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        
        return (double) sum / numbers.length;
    }
    
    // Bonus: Additional method to demonstrate calculateAverage with size parameter
    public static double calculateAverageWithSize(int[] arr, int size) {
        if (arr == null || size <= 0) {
            return 0.0;
        }
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        
        return (double) sum / size;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Method calls
        
        // Demonstrating existing methods
        System.out.println("=== Demonstrating Existing Methods ===");
        
        // Method with no parameters and no return value
        printsWelcome();
        System.out.println();
        
        // Method with no parameters and return value
        String greeting = getGreetingMsg();
        System.out.println(greeting);
        System.out.println();
        
        // Method with no parameters and return value (random number)
        int randomNum = generateRandomNumber();
        System.out.println("Random number (0-100): " + randomNum);
        System.out.println();
        
        // Method with parameters and no return value
        printSum(15, 25);
        System.out.println();
        
        // Method with parameters and no return value (array)
        int[] sampleArray = {10, 20, 30, 40, 50};
        System.out.println("Array values:");
        printArrayValues(sampleArray, sampleArray.length);
        System.out.println();
        
        // Method with parameters and return value
        int normalizedGrade = normalizeGrade(95);
        System.out.println("Normalized grade (95): " + normalizedGrade);
        normalizedGrade = normalizeGrade(45);
        System.out.println("Normalized grade (45): " + normalizedGrade);
        normalizedGrade = normalizeGrade(65);
        System.out.println("Normalized grade (65): " + normalizedGrade);
        System.out.println();
        
        int computeResult = compute(3, 4);
        System.out.println("Compute result (3, 4): " + computeResult);
        System.out.println();
        
        // Exercise 1: Method call for printStudentInfo
        System.out.println("=== Exercise 1: printStudentInfo ===");
        printStudentInfo("John Doe", 12345, 3.75, "Computer Science");
        System.out.println();
        printStudentInfo("Jane Smith", 67890, 3.92, "Mathematics");
        System.out.println();
        
        // Exercise 2: Method call for calculateAverage
        System.out.println("=== Exercise 2: calculateAverage ===");
        int[] testScores = {85, 90, 78, 92, 88};
        double average = calculateAverage(testScores);
        System.out.println("Test scores: 85, 90, 78, 92, 88");
        System.out.println("Average score: " + String.format("%.2f", average));
        System.out.println();
        
        // Additional test cases for Exercise 2
        int[] emptyArray = {};
        double emptyAverage = calculateAverage(emptyArray);
        System.out.println("Empty array average: " + emptyAverage);
        
        int[] singleElement = {100};
        double singleAverage = calculateAverage(singleElement);
        System.out.println("Single element average: " + singleAverage);
        System.out.println();
        
        // Bonus: Demonstrating calculateAverageWithSize
        System.out.println("=== Bonus: calculateAverageWithSize ===");
        int[] partialArray = {95, 87, 76, 82, 91, 88, 79};
        double partialAverage = calculateAverageWithSize(partialArray, 5);
        System.out.println("First 5 elements average: " + String.format("%.2f", partialAverage));
    }
}