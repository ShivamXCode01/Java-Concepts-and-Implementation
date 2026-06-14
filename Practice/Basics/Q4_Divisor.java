//  Write a program where the user is asked to enter two
// integers (divisor and dividend) and the quotient and the
// remainder of their division is computed.(Both divisor and
// dividend should be integers.)

import java.util.Scanner;

class Q4_Divisor{
    public static void main(String[] a){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Dividend:");
        int Div =sc.nextInt();

        System.out.print("Enter Your Divisor:");
        int Divisor=sc.nextInt();

        int rem = Div % Divisor;
        System.out.println("Your remainder:"+rem);

        double quotient = Div / Divisor;
        System.out.println("Your quetient:" +quotient);

        
        


    }
}