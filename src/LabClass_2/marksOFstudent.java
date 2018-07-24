//Lab-2 Problem-4: sum and average of student marks
package LabClass_2;
import java.util.Scanner;

public class marksOFstudent {
   public static void main(String[] arg)
   {
       int x,y,z,w;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter marks: ");
       x = input.nextInt();
       System.out.println("Enter marks: ");
       y = input.nextInt();
       System.out.println("Enter marks: ");
       z = input.nextInt();
       System.out.println("Enter marks: ");
       w = input.nextInt();
       
       double average = (x+y+z+w)/4.0;
       
       System.out.println("Total marks = "+(x+y+z+w));
       System.out.println("Average of marks = "+average);
       
   }
}
