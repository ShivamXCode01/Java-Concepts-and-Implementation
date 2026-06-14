// static means a member belongs to the class itself, so it can be accessed without creating an object and can be called using the class name.

class mobile{
    String brand;
    int price;
    static String name;

    public void Show(){
        System.out.println(brand + " " + price + "  " + name + " " );
    }


     //Static Block :- used to initialize the static variable ruuning once when th ecalss is loaded
    // A static block is a block of code marked with static that:
    // Executes automatically
    // Executes only once
    // Executes when the class is loaded
    // Executes before main()

       static {
        System.out.println("Static block executed");
    }
}

public class L_15_Staic_Keyword{
    public static void main(String a[]){
        mobile mb = new mobile();
        mb.brand = "Motorola";
        mb.price = 25000;
        mobile.name = "Edge 60 Fusion";

        mb.Show ();
     
    }

 


   

}