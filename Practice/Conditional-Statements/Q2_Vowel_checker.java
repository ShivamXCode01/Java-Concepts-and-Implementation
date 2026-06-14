//Write a Program to Check Whether a Character is Vowel or Consonant.

import java.util.Scanner;

class Q2_Vowel_checker{
    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a charcter:");
        char c = sc.next().charAt(0);

        char b = Character.toUpperCase(c);

        if ( b == 'A' || b == 'E' || b == 'I' || b == 'O' || b == 'U'){
            System.out.println("You enter a vowel letter");
        }
        else{
            System.out.println("You Entered a consonat letter");
        }
    }
}