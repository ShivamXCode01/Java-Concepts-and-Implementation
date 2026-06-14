// Encapsulation is the method to hiding that or method that is can't be used by outside the class 
// it is private data 

class Human{
    String name;            // This is public variable means accessable from every where in the program
    private int age;        // This is a private variable means it is only accesable inside the class
    private int Salary;     // If we want to access it ouside the class then we need  a getter method or to set it we need setter method
    
    public int getAge(){
        return age;
    }

    public int getSalary(){
        return Salary;
    }


    public void setAge(int a){  // Here we notice that we use this keyword the purpose of this keyword is that it tells us that this
        this.age = a;          // variable is a instance variable that is assign to the local variable 
    }

    public void setSalary(int n){
        this.Salary = n;
    }
}

public class L_16_Encapsulation_OOP{
    public static void  main(String a[]){
        Human h = new Human();
        h.name = "John Doe";
        System.out.println("Name:" + h.name);

        // to access the age we have to call getAge method
        h.setAge(23); // this is used to set the value of age using setAge method that we created in the Human class
        System.out.println("Age:" + h.getAge()); // By default if we not assign any value to integer then it give zero

        h.setSalary (125000);
        System.out.println("Salary:" + h.getSalary());
        
    }
}