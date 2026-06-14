//Write a Program to Multiply two decimal Numbers
//entered by User

import java.util.Scanner;

class Q7_Decimal_Mul{
        public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number:");
        double c = sc.nextDouble();

        System.out.print("Enter b number:");
        double b = sc.nextDouble();

        double d = c * b;

        System.out.println("Your Product:" + d);
}
}