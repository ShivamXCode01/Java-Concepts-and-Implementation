import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class L_34_Sorting {
    public static void main(String a[]){
        ArrayList <Integer> al = new ArrayList<>();
        al.add(54);
        al.add(1);
        al.add(967);
        al.add(5);
        al.add(6);
        al.add(3);

        System.out.println("Before Sorting: "+al);
        Collections.sort(al);
        System.out.println("After Sorting: "+al);


        // Sorting to get our desired output
        Comparator <Integer> com = new Comparator <Integer> () {
            public int compare(Integer i , Integer j){
                if (i%10 > j % 10){
                    return 1; // Swap the numbers
                }
                else{
                    return -1; // not swap
                }
            }
        };

        Collections.sort(al,com);
        System.out.println(al);
    }
    
}
