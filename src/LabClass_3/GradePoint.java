package LabClass_3;

import java.util.Scanner;

public class GradePoint {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if(number<0) System.out.println("Wrong Input: Negative number!");
        else if(number>=0 && number<40) System.out.println("Fail!");
        else if(number<45) System.out.println("D");
        else if(number<50) System.out.println("C");
        else if(number<55) System.out.println("C+");
        else if(number<60) System.out.println("B-");
        else if(number<65) System.out.println("B");
        else if(number<70) System.out.println("B+");
        else if(number<75) System.out.println("A-");
        else if(number<80) System.out.println("A");
        else if(number<=100) System.out.println("A+");
        else System.out.println("Wrong Input: Greater than 100!");
    }
}
