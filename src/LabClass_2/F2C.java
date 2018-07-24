//Lab-2 Problem-2: Fahrenheit to Celsius 
package LabClass_2;
import java.util.Scanner;
public class F2C {
    public static void main(String[] arg)
    {
        double F,C;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value: ");
        F = input.nextDouble();
        
        C = 0.5555556*(F-32);
        
        System.out.println(F+" Fahrenheit = "+C+" Celsius");
    }
}
