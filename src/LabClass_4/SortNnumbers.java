package LabClass_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList <Integer> numbers = new ArrayList<>();
        int n;
        n = input.nextInt();
        while(n!=0){
            numbers.add(input.nextInt());
            n--;
        }
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
