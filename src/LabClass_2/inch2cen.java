//Lab-2 Problem-1: inch to centimeter conversion
package LabClass_2;
import java.util.Scanner;

public class inch2cen {
    public static void main(String[] arg)
    {
        double inch,cen;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter inch value: ");
        inch = input.nextDouble();
        
        cen = inch*2.54;
        
        System.out.println(inch+" inch = "+cen+" centimeter");
    }
}
