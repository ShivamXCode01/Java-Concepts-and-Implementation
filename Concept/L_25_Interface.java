// Interface :- it tells a class to what to do not how to do.
// It is only usead to initialization  not to implementing.

interface Computer{
    void code();
}

class laptop implements Computer{
    public void code(){
        System.out.println("We are created an interfacea and implementing it.");
    }
}

public class L_25_Interface{
    public static void main(String a[]){

        Computer lap = new laptop();

        lap.code();

    }
}

// By deafault every method in the interface is public     
// We can't intialize abstract class (interface)


// There three types of interfaces 
// 1. Normal interface :- if it has more then 2 method present
// 2. Functional interface:- if it has only one method then called functional interface
// 3. Marker :- if there is no method inside the interface 
