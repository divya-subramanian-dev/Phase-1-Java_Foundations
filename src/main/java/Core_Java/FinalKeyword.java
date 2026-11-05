/*
FINAL KEYWORD WITH VARIABLES:- 
- when we create a variable by intialize value , we possible to chnage the value of it right
- but when we need to make that as constant - use final keyword 
- Not allow to change that final variable.
- Make constant variable as final
EX:
final int num =8;
num = 9; - it shows compilation error
System.out.println("Final value of num is : " + num);


FINAL KEYWORD WITH METHODS:- 
- when no other class want to override my method
- make method as final when no other class override my own method
EX:
class Calcu
{
    final public void show()
    {
        System.out.println("In Calcu show");
    }
    public void add(int a, int b)
    {
        System.out.println("Adiition of numbers = " + (a+b));
    }
}
class AdvCalcu extends Calcu
{
    public void show()
    {
        System.out.println("In AdvCalcu show");
    }
}
Here it cause compilation error - not possible to override final method


FINAL KEYWORD WITH CLASS:- 
- when my class want to constant means no other class allow to extends final class
- make a class final when not allow other class to extend it 
EX:
final class Calcu
{
    public void show()
    {
        System.out.println("In Calcu show");
    }
    public void add(int a, int b)
    {
        System.out.println("Adiition of numbers = " + (a+b));
    }
}
class AdvCalcu extends Calcu {}
above cause compilation error - not allow to extend final class

*/

//final class Calcu
class Calcu
{
    final public void show()
    {
        System.out.println("In Calcu show");
    }
    public void add(int a, int b)
    {
        System.out.println("Adiition of numbers = " + (a+b));
    }
}
class AdvCalcu extends Calcu
{
    // public void show()
    // {
    //     System.out.println("In AdvCalcu show");
    // }
}
public class FinalKeyword 
{
    public static void main(String args[])
    {
        //============ FINAL VARIABLE ===========
        final int num =8;
        // num = 9; - it shows compilation error
        System.out.println("Final value of num is : " + num);
    }
}
