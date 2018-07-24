//Lab-2 Problem-3: Area and Circumference
package LabClass_2;
import static java.lang.Math.PI;
import java.util.Scanner;

public class circle {
    public static void main(String[] arg)
    {
        double radius,area,circum;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius = input.nextDouble();
        
        area = PI*radius*radius;
        circum = 2*PI*radius;
        
        System.out.println("Area of Circle is "+area);
        System.out.println("Circumference of Circle is "+circum);
    }
}
