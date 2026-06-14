// Write a Program to Print Integer Number Entered by User

import java.util.Scanner;

class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();   // for full line input

        System.out.print("Enter your age: ");
        int age = sc.nextInt();        // for integer input

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        sc.close();
    }
}
