//it is nothing but it is usead to intialize the object 
// Same name as class
// No return type
// Automatically called when object is created

class SayMyname{
    String greet;
    String name;

    // Default Constructor
    SayMyname(){
        greet = "Hello";
        name = "John Doe";
        System.out.println(greet + " " + name);
    }

    // Parameterized Constructor
    SayMyname(String greet, String name){
        System.out.println(greet + " " + name);
    }
}

public class L_24_Constructor{
    public static void main(String[] args){

        SayMyname s1 = new SayMyname();
        SayMyname s2 = new SayMyname("Jai","Ho");
        
    }
}