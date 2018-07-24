package LabClass_3;

import java.util.Scanner;

public class GrossPay {
    public static void main(String[] args) {
        double hours, rate, gross,tax;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter hours: ");
        hours = input.nextDouble();
        System.out.println("Enter rate: ");
        rate = input.nextDouble();

        tax = 0;

        gross = hours*rate;
        if(gross>5000){
            tax = gross*.05;
            gross = gross-tax;
        }
        System.out.println("Net Pay = "+gross);
        System.out.println("Tax = "+tax);
    }
}
