// Write a Program to Check whether a year entered by
// user is Leap Year or not

import java.util.Scanner;

class Q4_Year_Checker{
    public static void main(String[] a){
        Scanner u = new Scanner(System.in);

        System.out.print("Enter year in YYYY format:");
        int y = u.nextInt();

        if ((y % 4 == 0 && y % 100 != 0 ) || (y % 400 == 0)){
            System.out.println("You entered a leap year.");
        }
        else{
            System.out.println("You entered normal year.");
        }
    }
}