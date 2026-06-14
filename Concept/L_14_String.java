//String is just a sequence of characters. And string is immutable 

public class L_14_String{
    public static void main(String a[]){
        String s = "Dunia"; // M-1 to decalration of string
        String s1 = new String("John Deo");  // M-2 to decalration of string
        System.out.println(s);
        System.out.println(s1);

        //String concatenation
        System.out.println(s1.concat(" reddy"));  // M-1
        System.out.println("Hello " + s);     // M-2

        System.out.println(s.charAt(2)); // To access the specific character of the string

        s1 ="Rammu"; // Here we reassign the value but we can't change the previous string because new string created 
                    // in the string pool in heap memory both are still exists 
        System.out.println(s1);

        //String Buffer means we cahnge immutable to mutable string

        StringBuffer sb = new StringBuffer ("Navin");
        System.out.println(sb);

         System.out.println(sb.capacity());  // it always main its original capacity that is 16 byte 

         sb.deleteCharAt(2);
         System.out.println(sb);

         sb.insert(2,'R');
         System.out.println(sb);

         String sr = sb.toString(); // it is used to convert buffer string to string 
         //sr.deleteCharAt(2); // gives error because it now become string  which is immutable
         System.out.println(sr);

         


        
        
    }
}