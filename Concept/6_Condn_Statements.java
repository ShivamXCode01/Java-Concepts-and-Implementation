class Conditional{
    public static void main(String[] a){

        int age = 20;

        if (age >= 18)            // here we hae only one statement to print so we can use it without curly brackets 
                                  // If we have more than one statements then we have to write curly brackets 
            System.out.println("You are the eligible for voting.");
        else
            System.out.println("You are not eligible for voting.");
    }
}