//Lab-2 Problem-6 : polynomial equation
package LabClass_2;
import java.util.Scanner;
import static java.lang.Math.pow;

public class polynominal {
    public static void main (String[] arg)
    {
        double x;
        double Y,X;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = input.nextInt();
        
        X = (x-1)/x;
        
        Y = X+ pow(X,2)/2+ pow(X,3)/3+ pow(X,4)/4;
        
        System.out.println("Value of Y = "+Y);
    }
}
