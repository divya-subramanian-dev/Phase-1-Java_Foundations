/* 

OBJECT CREATION:-
    Laptop device = new Laptop();
Here, both reference and object creation is of Laptop class
        
DYNAMIC METHOD DISPATCH :-
Create reference of parent class and create object of child class Here Object child's reference type is parent
Laptop is a computer and computer is a Laptop 

EXAMPLE 1:-
class Computer
{
    public void show()
    {
        System.out.println("In Computer parent class");
    }
}
class Laptop extends Computer
{
    
}
public class DynamicMethodDispatch 
{
    public static void main(String args[])
    {
        Computer device = new Laptop();
        device.show();
    }
}
Here in this case ,show method in parent class so result is In Computer parent class

EXAMPLE 2 :-
class Computer
{
    public void show()
    {
        System.out.println("In Computer parent class");
    }
}
class Laptop extends Computer
{
    public void show()
    {
        System.out.println("In Laptop child class");
    }
}
public class DynamicMethodDispatch 
{
    public static void main(String args[])
    {
        Computer device = new Laptop();
        device.show();
    }
}
In this case, have show method in both parent and child class but child class method overrides parent
so result is In Laptop child class

EXAMPLE 3:-
public class DynamicMethodDispatch 
{
    public static void main(String args[])
    {
        Computer device = new Computer();
        device.show();

        device = new Laptop();
        device.show();
    }
}
IN this case,
Computer device = new Computer(); - this line display result of parent class "In Computer parent class"
device = new Laptop(); -> this line change the address of device object to refer the laptop class now display "In Laptop child class"

NOTES:-
SAME OBJECT BEHAVES DIFFERENTLY BASED ON METHOD CALLS AT RUNTIME IS CALLED DYNAMIC METHOD DISPATCH(runtime polymorphism)
Here we use same reference type only changes the object creation right this is only possible because of inheritance 
only possible to use same reference type with different object when have parent child relationship between classes.

*/

class Computer
{
    public void show()
    {
        System.out.println("In Computer parent class");
    }
}
class Laptop extends Computer
{
    public void show()
    {
        System.out.println("In Laptop child class");
    }
}
class Tab extends Computer
{
    public void show()
    {
        System.out.println("In Tab child class");
    }
}
public class DynamicMethodDispatch 
{
    public static void main(String args[])
    {
        Computer device = new Computer();
        device.show();

        device = new Laptop();
        device.show();

        device = new Tab();
        device.show();
    }
}
