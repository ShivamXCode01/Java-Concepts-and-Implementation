// Inheritance is the condition where a class can take/acquire  properties and behaviour or methods  of another class
// parent class to child class 

class Cal {   // it is the parent class
    
    int add(int a , int b){
        return a + b;
    }
     int sub(int a , int b){
        return a - b;
    }

}

class AdvCal extends Cal{  // it is child class that inheritates from the parent class Cal
        int mul(int a , int b){
            return a * b;
        }
}

public class L_18_Inheritance{
    public static void main(String a[]){
        Cal c = new  Cal();
        System.out.println(c.add(78,32));

        AdvCal ad = new AdvCal();
        System.out.println(ad.add(78,32));
        System.out.println(ad.sub(78,32));
        System.out.println(ad.mul(78,32));
    }
}


// Method overriding is the condition in which the subclass (child) method over write 
// the superclass (parent) method 