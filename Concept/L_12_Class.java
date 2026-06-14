class Sum{
    public int add(int n1,int n2){
        int r = n1 + n2;
        System.out.println("You are doing addition.");
        return r;
    }
}

public class L_12_Class{
    public static void main (String[] a){
        int n1 = 67;
        int n2 =98;

        Sum calc = new Sum();
        int result = calc.add(n1,n2);

        System.out.println(result);
    }
}