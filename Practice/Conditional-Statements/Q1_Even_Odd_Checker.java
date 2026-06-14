// Write a Program to Check Whether Number is Even or Odd

import java.util.Scanner;

class Q1_Even_Odd_Checker{
    public static void main(String[] a){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        int n = sc.nextInt();

        //method 1
        
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
