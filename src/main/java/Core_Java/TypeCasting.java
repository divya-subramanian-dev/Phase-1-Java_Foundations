class TypeCasting
{
    public static void main(String a[])
    {
        // Implicit Type Conversion is called  conversion
        byte b = 127;
        int num = 12;
        // while storing big value in small capacity data type it cause error(store int in byte)
        //b = num;
        // Storing small value in big capacity data type ( automatically convert the type of byte to int)
        num = b;
        System.out.println("byte into int conversion = " + num);

        // Explicit Type Conversion is called casting(if neccessary want to store big vlaue in small capacity data type do casting)
        byte by = 127;
        int num1 = 12;
        by = (byte)num1;
        System.out.println("int to byte casting  = " + by);    
        
        // Perform modulus - when do explicit casting 
        int x = 257;
        byte y = (byte)x; // here 257 value is out of range for byte datatype , in this case do modulus like 257 % 256 = 1
        System.out.println("if int to byte value is out of range for byte type perform modulus automatically = " + y);    

        // Type promotion - while do addition it goes out of range so we want to store it as interger 
        byte z = 10;
        byte k = 30;
        int result = z + k; 
        System.out.println("type promotion = " + result);    

    }
}
