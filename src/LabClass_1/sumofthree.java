//Lab_1 Problem_2: Sum of three numbers
package LabClass_1;
import java.util.Scanner;

public class sumofthree {
   public static void main(String[] arg)
   {
       int num1,num2,num3;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter Number ");
       num1 = input.nextInt();
       System.out.println("Enter Number ");
       num2 = input.nextInt();
       System.out.println("Enter Number ");
       num3 = input.nextInt();
       
       System.out.print("Sum of three numbers is ");
       System.out.println((num1+num2+num3));
   }
}
