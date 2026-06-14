// Write a Program to Swap Two Numbers

import java.util.Scanner;

class Q5_Swap{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int c = sc.nextInt();

        System.out.print("Enter b number:");
        int b = sc.nextInt();

        // Method 1 ;    

        int temp = c ;
        c = b ;
        b = temp ;

        System.out.println(c);
        System.out.println(b);

        // Method 2

        c = c+b;
        b = c-b;
        c = c-b;
        System.out.println(c);
        System.out.println(b);

        


    }
}