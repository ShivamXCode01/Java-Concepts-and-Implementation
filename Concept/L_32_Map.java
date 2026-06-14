// Map is a type of data structure that stores values in key and pair

import java.util.HashMap;
import java.util.Map;


public class L_32_Map {
    public static void main(String a[]){

        Map <String,Integer> Students = new HashMap<>();

        Students.put("Navin",89);
        Students.put("harsh",45);
        Students.put("Naresh",68);
        Students.put("Kiran",97);

        System.out.println(Students);

        System.out.println(Students.replace("Naresh",78)); // it is used to replace the values
        System.out.println(Students);

        System.out.println(Students.keySet()); // it is used to find the keys

        System.out.println(Students.values()); // it is usead to find the values that presenta  in the map

        System.out.println(Students.size()); // it gives the size of the map 

        // There are lots of meathod preasent in the map 
        // in the map keay must be unique

        //Hashmap and hashtable is same only difference is that hashtable is better in use in the multiple thread

    }
}
