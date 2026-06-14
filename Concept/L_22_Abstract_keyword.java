abstract class Car{
    public void Say(){
        System.out.println("You are making a car");
    }
    // Here we can't decalare method without implementing it so we made it abstract method 
    // We must have abstract class to define abstract method without abstract class abstract method can't possible;
    
    //public void Engine();
    
    abstract public void Engine();

    
}

class L_22_Abstract_keyword{
    public static void main(String a[]){
        
        // We also not call abstract class 
        
        //Car c = new Car();
        //c.Say();
        
    }
}