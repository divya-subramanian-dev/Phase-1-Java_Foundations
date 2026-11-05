class ConditionalStmt
{
    public static void main(String arr[])
    {
        // IF STATEMENT - if condition is true execute statment in block
        System.out.println("IF STATEMENT - if condition is true execute statment in block:-");
        int x = 18;
        if(x > 10)
        {
            System.out.println("if x greater than 10 execute this statement");
        }
        if(x >= 10 && x<=20)
        {
            System.out.println("if x greater than 10 and less than 20 execute this statement");
        }
        
        // IF ELSE STATEMENT - if condition is true execute statment if block , if not true execute else block
        System.out.println("IF ELSE STATEMENT - if condition is true execute statment if block , if not true execute else block:-");
        int m = 7;
        int n = 10;
        if(m > n)
            System.out.println("m is greater than n");
        else
            System.out.println("n is greater than m");
        
        // IF ELSE IF , ELSE  STATEMENT - if condition is true execute statment if block , if not true execute else block have more value to comapare use ELSE IF stmt
        System.out.println("IF ELSE IF , ELSE  STATEMENT - if condition is true execute statment if block , if not true execute else block have more value to comapare use ELSE IF stmt:-");
        int a = 5;
        int b = 7;
        int c = 9;
        if(a>b && a>c)
        {
            System.out.println("a is greatest");
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greatest");
        }
        else
        {
            System.out.println("c is greatest");
        }

        // DO if else operations in single line is ternory operator
        System.out.println("TERNARY OPERATOR:-");
        int t = 87;
        int result = t % 2 == 0 ? 10 : 20;
        System.out.println("t is even or odd ? = " + result);

        // Switch statement - alterantive for if and else 
        System.out.println("Switch statement :-");
        int day = 5;
        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter valid number");
        }
    }
}