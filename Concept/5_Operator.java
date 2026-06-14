// Operator is used to do operations
//Types of operations

class Operator{
    public static void main(String[] a){

        //1.Assignmenet Operator
        int b = 5; // here we assigning value of b to 5 using assignment operator
        System.out.println(b);

        //2.Comparision Operator
        int c = 6;
        int d = 7;
        
        // Types of comaparision operator  :--  >,<,<=,>=,==,!= 

        boolean e = c > d; // here we get a output boolean datatype so we need to store in boolean type
        System.out.println(e);


        //Logical operator

        int f = 78;
        int g = 67;

        // types of logical opoerator :----  and &&, or || , not !

        boolean k = (c < d) || (f < g);

        System.out.println(k);

    }
}