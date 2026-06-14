// DataTypes nothing but it give the type of data that is stored by variable

class DataTypes{
    public static void main (String[] a){
        Integer A = 6;  // here we can't get the int class because int is a primitive dataType so we use Integer
        System.out.println(A.getClass().getSimpleName()); // To get the class or type of any variable

        String S ="Shivam";
        System.out.println(S.getClass().getSimpleName());
        char  K = 'X';
        //System.out.println(K.getClass().getSimpleName()); //float, char , double, cannot be dereferenced beacuse they 
        
        boolean T = true;
        
        float F = 3.14f;     // for float value we need to write f in the end of the digit
        
        double D = 3.0;

        int binary = 0b111; // it is a binary number because use wrote b b/w the digit
        System.out.println(binary);

        int HexaDecimal = 0x7E; // it is hexadecimal number because we use x b/w the digit
        System.out.println(HexaDecimal);

        int Million = 10_00_00_000; // it is same as 1000000000 becuase in java we can write thing like also for better understanding
        System.out.println(Million);

    }
}