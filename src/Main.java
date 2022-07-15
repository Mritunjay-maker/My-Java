/*
	    MODEL
	        Storage Container
	            1. Single Value Containers     -> Primitive Types
	                a single value

	                    Integral
	                    Floating Point
	                    Character
	                    Boolean

	            2. Multi Value Containers     -> Reference Types
	                More than one Value
	                    2.1 Homogenous
	                        Arrays
	                        Object
	                    2.2 Heterogeneous
	                        Objects

	        DATA TYPES -> To create a storage container we need to define the type of it.
            1. Integral
                byte    8 bits
                short   16 bits
                int     32 bits
                long    64 bits

            2. Floating Point
            float   32 bits
            double  64 bits

            3. Characters
                char    16 bits

            4. Logical
                boolean     8 bits [out of 8 bits only 1 bit is used.]



	     */
public class Main {

    public static void main(String[] args) {
        //Creation Statement -> Create a storage container named as age[variable]
        //Store the data in 35 in it | 35(literal)
        // byte is the type of storage container which means allocate as size of 8 bits
        byte age = 35;
        // age is 8 bits(Stack) while 35 is 32 bits (Constant Pool)
        //2. Update Statement
        // 8 bits -> 2 power 8 | 256 / 2 => -128 to 0 to 127
        age = 40;
        //age = 128; -> error :( out of range
        //DOWN CASTING
        // literal of size 32 bits is copied into 8 bits
        // It is taken care by compiler automatically -> IMPLICIT DOWN CASTING

        // We can do it ourselves as well
        age = (byte)128;
        long phoneNumber = 7814112059L; // ->64 bit literal
        System.out.println("age is" + age);

        // upcasting
        // here 32 bits are copied into 64 bits
        long data = 200; // 200 -> 32 bits

        // Down casting
        //here 64  bits are copied into 32 bits
        // we will get error in down casting -> add a manual cast
        // but this can be a problem -> as we may lose data
        int number = (int)data;
    }
}
