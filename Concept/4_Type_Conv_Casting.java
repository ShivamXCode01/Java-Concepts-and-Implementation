// Type conversion is the process of converting variable from one type to another data type implicitly means automatically.
//Type Casting is the process of converting one  type to another type explicity means forcefully.

class TypeCating{
    public static void main(String[] a){
        int b = 3456;
        byte c = 75; 
 //         c = b;    // we can't perform because byte has smaller range than int so we can't but vice versa is possible 
           b = c ;  
        System.out.println(c);
        System.out.println(b);




        // Type promotion means promoting one smaller data type to larger range datatype
        //Example of byte promoted to int

        byte d = 10 ;
        byte e = 40;

        int  result = d * e;   // after multiplying 10 x 40 = 400 which is out of byte range so 
                              //  it is promoted to int then we need a vaiable of int to store that result
        System.out.println(result);


        //Type Casting

        float f = 5.34f;  // it is a flaot datatype
        int s = (int)f; // here we converting float datatype to integer forcefully
        
        System.out.println(f);
        System.out.println(s);

        
                    
        
    }

}