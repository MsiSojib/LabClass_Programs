package LabClass_4;

import java.util.Scanner;

public class DiamondShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter element of Shape: ");
        int number;
        number = input.nextInt();
        int space = number -1;
        int lastPart = number-1;
        for(int mainLoop =1; mainLoop<=number; mainLoop++){
            for(int spLoop = 1; spLoop<=space; spLoop++){
                System.out.print(" ");
            }
            space--;
            for(int starLoop=1; starLoop<=mainLoop*2-1; starLoop++){
                System.out.print("*");
            }
            System.out.println();
        }
        space = 1;
        for(int mainLoop = 1; mainLoop<=lastPart; mainLoop++){
            for(int spLoop = 1; spLoop<=mainLoop; spLoop++){
                System.out.print(" ");
            }
            space++;
            for(int starLoop = 1; starLoop<=2*(number-1)-1; starLoop++){
                System.out.print("*");
            }
            number--;
            System.out.println();
        }
        

    }

}
