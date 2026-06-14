import java.util.Scanner;

public class L_13_Arrays{
    public static void main(String a[]){
        
        int n1[] = {3,2,5,8,7};  // in this array decalre we decide the size of array of array at the time of initialization means no of 
                                // elements is equal to the size of array after that we can't re dceclare the size of array
        int n2 [] = new int [4]; // in this we decalre the size of array at the time initialization
                                // we assign the values using their index number example is give below 
        n2[0]=5;
        n2[1]=6;
        n2[2]=9;
        n2[3] =78;

        int n3[]={5,3,2,5,2};
        System.out.println(n1);
        System.out.println(n2);

        // We can access the elements of arrray just using their index

        System.out.println(n1[0]);
        System.out.println(n2[0]);
        System.out.println(n3[0]);
        System.out.println(n1[3]);
        System.out.println(n2[1]);
        System.out.println(n3[2]);

        //We can also reassign or chaange the values of array with the help of their index

        n1[0] = 90;
        n2[0] = 89;
        n3[0] = 78;
        System.out.println(n1[0]);
        System.out.println(n2[0]);
        System.out.println(n3[0]);


        // Printing the elements of array
        System.out.println("Your elements of array n1 is: ");
        for (int i = 0 ; i < n1.length ; i++){
            System.out.print( n1[i]+"  ");
        }
        System.out.println();


        //Best way to print the array elements using for each loop or enhanced loop
        System.out.println("Your elements of array n2 is: ");
        for (int n[]: n1){
            System.out.print(n +" ");

        }


        //2-D arrays 
        //initialization

        // nums[i][j] = (int)(Math.random()*10);

        // for (int n[] : nums){
        //     for (int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
          
    }
}