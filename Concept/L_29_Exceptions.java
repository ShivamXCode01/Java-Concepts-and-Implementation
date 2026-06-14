// Exceptions is a way of handling Runtime errors in the function

// Types of error 
// 1. Compile time error
// 2. Runtime Error
// 3. Logical error

public class L_29_Exceptions{
    public static void main(String a[]){
        int i = 4 ;
        int j = 0 ;
        
        //System.out.println(i/j); this line of code gives error so we handle it using 
        // try catch block

        try{
            int k = i / j;
        }
         catch (ArithmeticException e){ // using this line we can handle only specific type of exception/
            System.out.println("You can't divide by zero");
        }
        catch(Exception e){ // using this line we handlead all types of exception
            System.out.println("Something went wrong.  " + e);
        }
        finally{
            System.out.println("I will execute always.");
        }
       
    }
}