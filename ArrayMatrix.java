package basicjava;

import java.util.Scanner;

public class ArrayMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][]A = new int[2][3];
        int[][]B = new int[2][3];

        System.out.print("enter the elements of array A:");

        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++) {
                A[row][col]=input.nextInt();
            }
        }
        System.out.print("enter the elements of array B:");

        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++) {
                B[row][col]=input.nextInt();
            }
        }
        System.out.println("A = ");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+A[row][col]);
            }
            System.out.println();
        }
        System.out.println("\n\n");
        System.out.println("B = ");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print(" "+B[row][col]);
            }
            System.out.println();
        }
        System.out.println("A+B = ");
        for(int row=0;row<2;row++){
            for(int col=0;col<3;col++){
                System.out.print("\t "+(A[row][col]+B[row][col]));
            }
            System.out.println();
        }
    }
}
