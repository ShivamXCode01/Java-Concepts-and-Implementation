//Write a Program to Find ASCII Value of a Character

import java.util.Scanner;

class Q6_ASCII_Value{
    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character:");
        char ch = sc.next().charAt(0);

        int A = ch;

        System.out.print(A);

    }
}