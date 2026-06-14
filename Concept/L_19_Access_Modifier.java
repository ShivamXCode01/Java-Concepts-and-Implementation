
class Name{
    public String name= "Shivam"; /// Here name is public so any one can access from any where they want 
    private int age = 32;  // It is private variable so it is only accessable inside the class if any one want to access it then it give 
                            // error  to access it we nees getter method
    public int getAge(){
        return age;
    }

    protected int ht ; // it is used in the same package means same file (class) 


}

class L_19_Access_Modifier{
    public static void main(String a[]){

        Name n = new Name();
        n.name = "John Doe";
        System.out.println(n.name);
        System.out.println(n.getAge());

        n.ht = 6;
        System.out.println(n.ht);

        
        
    }
}