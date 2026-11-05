class Literals
{
    public static void main(String a[])
    {
        // ======================= LITERALS ======================= 
        // Integer Literals - USE BINARY , DECIMAL ,OCTAL ,HEXADECIMAL NUMBERS AS LITERALS(values stored in variable)
        System.out.println("Integer Literals");
        int binary = 0b10;
        int hexadecimal = 0xaf;
        System.out.println("binary value = "+binary);
        System.out.println("hexa value = "+hexadecimal);
        //use underscore inbetween numbers for readablity
        int num1 = 10_00_00_000;
        System.out.println("underscore inbetween num value = "+num1);
        // Float Literals - use "e" exponenet character in double and float
        System.out.println("Float Literals");
        double exponent  = 12e8;
        System.out.println("exponent in double = "+exponent);
        // character literals (character also work like interger)
        System.out.println("Character Literals");
        char alpha= 'a';
        alpha++;// (increment by ascii values)
        System.out.println("char increment = "+alpha);
        // Boolean literals 
        System.out.println("Boolean Literals");
        boolean flag1 = false;
        boolean flag2 = true;
        System.out.println("true value = "+flag1);
        System.out.println("false value = "+flag2);
    }
    
}
