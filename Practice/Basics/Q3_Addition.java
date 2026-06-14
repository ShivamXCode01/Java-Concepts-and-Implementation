//Write a Program to Add Two Integer Numbers Entered by
//User

import java.util.Scanner;

class Sum{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your First Number:");
        int n1 = sc.nextInt();
        System.out.println("Enter Your Second Number:");
        int n2 = sc.nextInt();
        
        int sum = n1 + n2;
        int Diff = n1 - n2 ;
        int Product = n1 * n2 ;
        double Div = n1 / n2;
        
        System.out.println("Your sum of two number:"+ sum);
        System.out.println("Your Difference of two number:"+ Diff);
        System.out.println("Your Product of two number:"+ Product);
        System.out.println("Your Division of two number:"+ Div);

    }
}