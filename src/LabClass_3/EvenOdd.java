package LabClass_3;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int number;
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter Number to check Even or Odd");
        number = inputObj.nextInt();

        if(number%2==0) System.out.println("This is Even number "+number);
        else System.out.println("This is Odd number "+number);

    }
}
