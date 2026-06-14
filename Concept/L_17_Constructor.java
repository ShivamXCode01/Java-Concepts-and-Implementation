// A constructor is a special method that runs automatically when an object is created.
// Its main job is to initialize (set up) the object.

class Car {                   // it is the type of non parametrized constructor
    String name = "Nexon";
    String Brand = "TATA";
    int Price = 1650000;
    
}

class Cars {         //constructors must be inside a class, not replace the class.

    String name;
    String brand;
    int price;

    // Parametrized constructor
    Cars(String name, String brand, int price) {
        this.name = name;   //both name refer to the parameter, not the class variable 
        this.brand = brand;  // so we uses this keyword to don't get confused
        this.price = price;
    }
}

public class L_17_Constructor{
    public static void main(String a[]){

        Car c = new Car();
        System.out.println(c.name);
        System.out.println(c.Brand);
        System.out.println(c.Price);

        Cars c1 = new Cars("Harrier","TATA",2250000);
        System.out.println(c1.name);
        System.out.println(c1.brand);
        System.out.println(c1.price);



    }
}