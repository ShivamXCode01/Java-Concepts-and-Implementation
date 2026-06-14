class Parent{
    public void Call(){
        System.out.println("We are in a parent class");
    }    
}

class Child extends Parent{
    public void call1 (){
        System.out.println("We are in a child class");
    }
}



class L_21_Down_Up_Casting{
    public static void main(String a[]){
        // Below program is known typecating means we converting a variable from one datatype to another 
        double d = 4.645;
        int n = (int) d;
        System.out.println(n);

        Parent A = new Child(); // upcasting
        A.Call();
        // Upcasting
        Child B = (Child) A; // downcasting
        B.call1();
    }
}