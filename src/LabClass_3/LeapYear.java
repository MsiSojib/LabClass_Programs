package LabClass_3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        year = input.nextInt(); //input year
        if((year%4 == 0 && year %100!=0) || (year%400 == 0))
            System.out.println(year+" is leap year.");
        else System.out.println(year+" is not leap year");
    }
}
