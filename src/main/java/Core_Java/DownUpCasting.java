/* 

TYPE CASTING:-
Implicit type conversion - when try to assign low size value to high size java automatically do type conversion
Ex: store byte in int 
Explicit type casting -  when try to assign high size value to low size java not allow it, we can explicitly do it by (int)
Ex: store double in int 

UP CASTING:-
create object of B class and assign to A class,now possible to call parent class method but not child class because reference type is A ,A class not known
anything about B class methods this is called Upcasting
EX:
A obj1 = new B();
obj1.show1();
obj1.show2(); -> it show compilation error

DOWN CASTING:-
now to call B class method , want to create a new reference type B and assign that object and do Downcasting 
EX:
B obj2 = (B)obj1;
obj2.show2();

*/

class A
{
    public void show1()
    {
        System.out.println("In A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("In B show");
    }
}
public class DownUpCasting 
{
    public static void main(String args[])
    {
        // ========= TYPE CASTING =========
        double d = 4.5;
        int i = (int)d;
        System.out.println("Type casting = " + i);

        // create object of A class and call A class method not have access to call B class method because A class not know anything about B class 
        A obj = new A();
        obj.show1();

        // ========= upcasting =========
        A obj1 = new B();
        obj1.show1();
        //obj1.show2(); -> it show compilation error

        //========= Downcasting =========
        B obj2 = (B)obj1;
        obj2.show2();
    }
}
