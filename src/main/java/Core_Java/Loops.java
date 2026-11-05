class Loops
{
    public static void main(String arr[])
    {
        // while loop - use when not know how many time to execute the condition, infinte loop , execute only when condition is true
        System.out.println("while loop - use when not know how many time to execute the condition");
        int i = 1;
        while(i <= 5)
        {
            System.out.println("Hi Divya - " + i);
            int j =1;
            while(j <= 3)
            {
               System.out.println("Hello Di - " + j);
               j++;
            }
           i++;
        }
        System.out.println("Bye Divya - " + i);

        
        // do while loop - use when want to execute stmt atleast once when while condition is false , if true execute while loop normally
        System.out.println("do while loop - use when want to execute stmt atleast once then based on condition");
        int a = 5;
        do
        {
            System.out.println("Hi Divya - " + a);
            a++;
        }
        while(a <= 5);
        
        
        // For loop - use when know how many time to execute the condition
        System.out.println("For loop - use when know how many time to execute the condition");
        // in number system numbers starts with 0 so here intitilaizw as 0
        for(int b = 1; b <=5; b++)
        {
            System.out.println("Day - " + b);
            for(int c = 1; c <=9 ; c++)
            {
                System.out.println("hour - " + (c+8) + " to " + (c+9));
            }
        }
    }
}