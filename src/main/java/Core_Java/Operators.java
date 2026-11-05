class Operators
{
    public static void main(String a[])
    {
        // ARITHEMETIC OPERATORS
        System.out.println("ARITHEMTEIC OPERATORS");
        int num1 = 7;
        int num2 = 5;
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println("Addition = " + add);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
        System.out.println("Modulus = " + mod);

        // ASSIGNMENT OPERATORS
        System.out.println("ASSIGNEMENT OPERATORS");
        int num = 7;
        num +=1;
        System.out.println("self addition = " + num);
        num -=1;
        System.out.println("self Subtraction = " + num);
        num *=1;
        System.out.println("self Multiplication = " + num);
        num /=1;
        System.out.println("self Division = " + num);
        num %=1;
        System.out.println("self Modulus = " + num);
        
        // UNARY OPERATORS
        System.out.println("UNARY OPERATORS");
        int number = 7;
        int pre = ++number;
        System.out.println("pre incremnt = " + pre);
        int post = number++;
        System.out.println("post incremnt = " + post);
        
        // RELATIONAL OPERATORS
        System.out.println("RELATIONAL OPERATORS");
        int x = 30;
        int y = 10;
        int z = 10;
        boolean greater_than = x > y;
        System.out.println("greater_than = " + greater_than);
        boolean lesser_than = x < y;
        System.out.println("lesser_than = " + lesser_than);
        boolean greater_than_equalto = x >= y;
        System.out.println("greater_than_equalto = " + greater_than_equalto);
        boolean less_than_equalto = x <= y;
        System.out.println("less_than_equalto = " + less_than_equalto);
        boolean eualto = y == z;
        System.out.println("eualto = " +eualto);
        boolean notequalto = x != y;
        System.out.println("noteualto = " + notequalto);

        // lOGICAL OPERATORS
        System.out.println("LOGICAL OPERATORS");
        int x1 = 30;
        int y1 = 10;
        int z1 = 10;
        boolean And_opr = x1 > y1 && y1 == z1;
        System.out.println("And_opr = " + And_opr);
        boolean Or_opr = y1 >= x1 || x1 == z1;
        System.out.println("Or_opr  = " + Or_opr );
        boolean not_opr = !(y1>z1);
        System.out.println("not_opr  = " + not_opr );

        //BITWISE OPERATOR
        System.out.println("BITWISE OPERATORS");
        int x2 = 30;
        int y2 = 10;
        int z2 = 10;
        int biwise_and = x2 & z2;
        System.out.println("biwise_and = " + biwise_and);
        int biwise_or = y2 | z2;
        System.out.println("biwise_or  = " + biwise_or);
        int biwise_not = ~(y2);
        System.out.println("biwise_not = " + biwise_not);
        int biwise_xor =  x2 ^ z2;
        System.out.println("biwise_xor  = " + biwise_xor);

        // SHIFT OPERATORS
        System.out.println("SHIFT OPERATORS");
        int m = 10;
        int left_shift = m << 1;
        System.out.println("left_shift  = " + left_shift);
        int right_shift = m >> 2;
        System.out.println("right_shift   = " + right_shift );
        int zero_right_shift = m >>> 1;
        System.out.println("zero_right_shift   = " + zero_right_shift);

        // TERNARY OPERATOR
        System.out.println("TERNARY OPERATOR");
        int n = 87;
        String res = n > 100 ? "yes" : "No";
        System.out.println("n>100? = " + res);
    }
}
