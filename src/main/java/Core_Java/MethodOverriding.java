/* 
METHOD OVERRIDING:-
In real time:
- In my 10th standard , if anyone ask what phone u have - i said samsung actually that is my parents phone even that also my phone
- now any one ask - what phone u have - i said redmi (this is my own phone)
- here my preference is my own not parents right 
*/

class Calcuator
{
    public int add(int a, int b)
    {
        return a+b;
    }
}
class AdvancedCalculator extends Calcuator
{
    // here we are overriding the add method of parent class
    public int add(int a, int b)
    {
        return a+b+10;
    }
}
public class MethodOverriding 
{
    public static void main(String args[])
    {
        AdvancedCalculator  obj = new AdvancedCalculator ();
        int r1 = obj.add(10,20);
        System.out.println("Result is: "+r1);
    }
}
