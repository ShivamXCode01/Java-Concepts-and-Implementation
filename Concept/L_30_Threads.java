// Threads is the smallest unit of any execution inside the program. It allow a program to execute 
// multiple task at the same time.

class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hii");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){}
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try{
                Thread.sleep(10);
            }
            catch(Exception e){}
        }
    }
}

public class L_30_Threads{
    public static void main(String a[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}