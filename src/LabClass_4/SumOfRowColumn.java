package LabClass_4;

import java.util.Scanner;

public class SumOfRowColumn {
    public static void main(String[] args) {
        int row,column;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row number: ");
        row = input.nextInt();
        System.out.println("Enter Column number: ");
        column = input.nextInt();

        int[][] matrix = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                matrix[i][j] = input.nextInt();
            }
        }
        int [] sumRow = new int[row];
        int [] sumColumn = new int[column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                sumRow[i] += matrix[i][j];

            }
        }
        for(int i=0; i<column; i++){
            for(int j=0; j<row; j++){
                sumColumn[i] += matrix[i][j];

            }
        }

        for(int i=0; i<row; i++){
            System.out.println("Sum of Row "+(i+1)+" is = "+sumRow[i]);
        }
        for(int i=0; i<column; i++){
            System.out.println("Sum of Column "+(i+1)+" is = "+sumColumn[i]);
        }


    }
}
