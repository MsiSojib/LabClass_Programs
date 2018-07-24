//Lab-2 Program-7: roots of quadratic equation
package LabClass_2;
import java.util.Scanner;
import static java.lang.Math.sqrt;

public class equation {
    public static void main(String[] arg){
        
        double a,b,c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        double root = b*b-4*a*c;
        double x1;
        if(root==0){ 
            x1 = -b/(2*a);
            System.out.println("Roots of the equation is "+x1);
        }
        else if (root<0) System.out.println("Imaginary Number!!");
        else{
                double m,n;
                m = (-b+sqrt(root))/(2*a);
                n = (-b-sqrt(root))/(2*a);
                
                System.out.println("Roots of the equation is "+m+" and "+n);
                
            }
        
        
        
    } 
}
