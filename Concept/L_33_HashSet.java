// HashSet is  a type of data structure that store only unique values in it 

import java.util.HashSet;


public class L_33_HashSet {
    public static void main(String a[]){
    
        HashSet <Integer> set = new HashSet<>();

        set.add(6);
        set.add(22);
        set.add(1);
        set.add(8);
        set.add(65);
        set.add(4);
        set.add(9);
        set.add(4);

        System.out.println(set);

        System.out.println(set.isEmpty());
        System.out.println(set.remove(4)); // it remove the elements directly
        System.out.println(set);

    }
    
}
