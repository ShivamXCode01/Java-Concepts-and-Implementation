//Write a Program to Find Largest Number Among Three
//Numbers entered by users

import java.util.Scanner;

class Q3_Largest_Finder{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter b :");
        int b = sc.nextInt();

        System.out.print("Enter c :");
        int c = sc.nextInt();

        System.out.print("Enter d :");
        int d = sc.nextInt();

        if( b > c && b > d ){
            System.out.println("B is greatest.");
        }
        else if( c > d ){
            System.out.println("C is greatest.");
        }
        else{
            System.out.println("D is greatest.");
        }

    }
}