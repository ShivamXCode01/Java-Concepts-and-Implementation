// Enumeration (Enum) is a special type of data types used to represent a fixed seta of constant values.
// We can't Extends and intialized enum classes. 


enum status{
    Running,Failed,Pending,Success;
}

public class L_26_Enum{
    public static void main(String a[]){
        status s = status.Pending;
        System.out.println(s);
        System.out.println("We are now in running state.");
        System.out.println(s.ordinal());  // it printing the order (starts from 0 ) here the order of running is 0 so output is zero.

        switch(s){
            case Running:
                System.out.println("We are in running state.");
                break;
            case Failed:
                System.out.println("We are in failed state.");
                break;
            case Pending:
                System.out.println("We are in Pending state.");
                break;
            case Success:
                System.out.println("We are in Success state.");
                break;
        }


    }
}