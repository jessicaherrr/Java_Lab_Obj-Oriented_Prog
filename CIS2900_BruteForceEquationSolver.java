
package cis2900_bruteforceequationsolver;
import java.util.Scanner;

/*
Numerous engineering and scientific applications require finding solutions to a set of equations.
Ex: 8x + 7y = 38 and 3x - 5y = -1 have a solution x = 3, y = 2. 
Given integer coefficients (a, b, c, d, e, and f) of two linear equations 
with variables x and y listed below, 
use brute force to find an integer solution for x and y in the range -10 to 10.

ax + by = c
dx + ey = f


 */
public class CIS2900_BruteForceEquationSolver {
    public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      
      // Read coefficients for the first equation: ax + by = c
      int a = scnr.nextInt();
      int b = scnr.nextInt();
      int c = scnr.nextInt();
      
      // Read coefficients for the second equation: dx + ey = f
      int d = scnr.nextInt();
      int e = scnr.nextInt();
      int f = scnr.nextInt();
      
      boolean solutionFound = false;
      
      // Brute force: try all x and y values from -10 to 10
      for (int x = -10; x <= 10; x++) {
         for (int y = -10; y <= 10; y++) {
            // Check if current (x, y) satisfies both equations
            if ((a * x + b * y == c) && (d * x + e * y == f)) {
               System.out.println("x = " + x + ", y = " + y);
               solutionFound = true;
               break; // Exit inner loop
            }
         }
         if (solutionFound) {
            break; // Exit outer loop
         }
      }
      
      // If no solution was found in the entire range
      if (!solutionFound) {
         System.out.println("There is no solution");
      }

    }
}
