package LabClass_3;

import java.util.Scanner;

public class LargestAmongFourNumber {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        int max;
        max = a;
        if(max<b) max = b;
        if(max<c) max = c;
        if(max<d) max = d;

        System.out.println("Largest is "+max);

    }
}
