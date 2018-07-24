//Lab-2 Problem-5: Area of a triangle
package LabClass_2;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class triangle {
    public static void main(String[] arg)
    {
        double A,B,C;
        double S,area;
        System.out.println("Enter A: ");
        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        System.out.println("Enter B: ");
        B = input.nextInt();
        System.out.println("Enter C: ");
        C = input.nextInt();
        
        S = (A+B+C)/2.0;
        A = S-A;
        B= S-B;
        C = S-C;
        
        area = sqrt(S*A*B*C);
        
        System.out.println("Area of the Triangle is "+area);
    }
    }

