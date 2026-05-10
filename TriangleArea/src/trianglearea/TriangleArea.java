
package trianglearea;

import java.util.Scanner;

public class TriangleArea {


    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();

        double base1, height1, base2, height2;
        base1 = scnr.nextDouble();
        height1 = scnr.nextDouble();
        base2 = scnr.nextDouble();
        height2 = scnr.nextDouble();
        
        // TODO: Read and set base and height for triangle1 (use setBase() and setHeight())
        triangle1.setBase(base1);
        triangle1.setHeight(height1);
        
        // TODO: Read and set base and height for triangle2 (use setBase() and setHeight())
        triangle2.setBase(base2);
        triangle2.setHeight(height2);
        
        System.out.println("Triangle with smaller area:");

        // TODO: Determine smaller triangle (use getArea())
        //       and output smaller triangle's info (use printInfo())
        double Area1 = triangle1.getArea();
        double Area2 = triangle2.getArea();
        if (Area1 < Area2) {
            triangle1.printInfo();
        }
        else {
            triangle2.printInfo();   
        }
    }

}
