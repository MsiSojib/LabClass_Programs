package LabClass_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Math.abs;

public class DecimalToBinary {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        ArrayList<Integer> store;
        store = new ArrayList<>();
        while (number != 0) {
            store.add(abs(number % 2)); //ensuring not Negative number
            number /= 2;
        }
        if(store.isEmpty()){
            store.add(0);
        }
        else Collections.reverse(store); //because ArrayList show first index to last
        System.out.println(store);
    }
}
