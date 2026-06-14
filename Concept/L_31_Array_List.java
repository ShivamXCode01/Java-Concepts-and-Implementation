
 
  // ArrayList is nothing but it is the class that implements from the list interface in the java collection framework.

import java.util.ArrayList;


public class L_31_Array_List{
    public static void main(String a[]){

        ArrayList <Integer> Al = new ArrayList<>();
        // Collection <Integer> Al = new ArrayList<>();
        // List <Integer> Al = new ArrayList<>();

        //Above the three ways are correct to create ArrayList object

        Al.add(5);
        Al.add(4);
        Al.add(8);
        Al.add(12);
        Al.add(7);
        System.out.println(Al);

        System.out.println(Al.get(2)); // Give the element that is present in that index

        System.out.println(Al.indexOf(8)); // give the index of the elements
        System.out.println(Al.isEmpty());  // Give boolean value true or false 
        
        System.out.println(Al.contains(5)); // it checks value is present or not 

        System.out.println(Al.remove(3));
        System.out.println(Al);

        // There are many inbuilt method in Arraylist

        

    }
}