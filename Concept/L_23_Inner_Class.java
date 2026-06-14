 class A{
    int age;
    public void show(){
        System.out.println("in Show");
    }
    static class B{
        public void Confi(){
            System.out.println("in Configu");
        }
    }
} 

class L_23_Inner_Class{
    public static void main(String a[]){

        A b = new A();
        b.show();
        //c.Conf(); // We can't access the method of class B to resolve this we have another way
        A.B s = new A.B();
        b.show();
        s.confi();
    }
}