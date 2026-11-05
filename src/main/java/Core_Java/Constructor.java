/*

NEED OF CONSTRUCTOR:-
If we didnt assign a value for instance variable using setter method 
then their default value is 0 for int and "null" for string values right
but without set the value to variable itself i want to assign a meaningful value to that variable as default
Example:
By default while every object is created age should be 22 name should be Divya 
that should be achieved using assign a value directly while define a variable or by 
using constructor.

ASSIGN VALUE WHILE DECLARE VARIABLE AS INITALIZATION:-
private int age = 12;
private String name = "John";

CONSTRUCTOR:-
In java everything is method, we want to pass a value using a method not directly ,constructor is like method
- It is a special method that assign a default value while create a object for that class.
- No need to call the constructore manually , every time while create a new object constructor get called.
- It looks like method itself , it have access modifier, name ,parameters only thing differ is not give return type.
- constructor name and class name should be same

1. DEFAULT CONSTRUCTOR:
These are default value stored in heap memory with object as default
In case we didnt create constructor for class , java by default create a default constructor not view in code - intenal process
EX: 
public Human()
{
    age = 12;
    name = "John";
}

2. PARAMETERIZED CONSTRUCTOR:
We can also pass these values for constructor as parameter while create object called parameterized constructor
EX:
class Human
{
    int age;
    String name;

    public Human(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
}
public class Constructor 
{
    public static void main(String args[])
    {
        Human obj = new Human(12,"John");
        System.out.println("name = " + obj.name);
        System.out.println("Age = " + obj.age); 
    }
}

CONSTRUCTOR OVERLOADING:-
this concept is same as method overloading
we can create a multiple constructor for different object with same name within same class but with different number of parameter 
and different type of parameters
EX:
class Human
{
    int age;
    String name;
    
    // This is default constructor just assinging value directly
    public Human()
    {
        age = 12;
        name = "John";
    }
    // This is parameterized constructor because it passing parameter variables
    public Human(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    // In this case , for age variable take '12' as default if no value pass by object
    public Human(String name)
    {
        this.age = 12;
        this.name = name;
    }
}
public class Constructor 
{
    public static void main(String args[])
    {
        Human obj = new Human();
        Human obj1 = new Human(22,"Divya");
        Human obj2 = new Human("Harini");
        System.out.println("name = " + obj.name + " " + "Age = " + obj.age);
        System.out.println("name = " + obj1.name + " " + "Age = " + obj1.age);
        System.out.println("name = " + obj2.name + " " + "Age = " + obj2.age);
    }
}

*/

class Human
{
    int age;
    String name;
    
    // This is default constructor just assinging value directly
    public Human()
    {
        age = 12;
        name = "John";
    }
    // This is parameterized constructor because it passing parameter variables
    public Human(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    // In this case , for age variable take '0' as default if no value pass by object
    public Human(String name)
    {
        this.age = 12;
        this.name = name;
    }
}
public class Constructor 
{
    public static void main(String args[])
    {
        Human obj = new Human();
        Human obj1 = new Human(22,"Divya");
        Human obj2 = new Human("Harini");
        System.out.println("name = " + obj.name + " " + "Age = " + obj.age);
        System.out.println("name = " + obj1.name + " " + "Age = " + obj1.age);
        System.out.println("name = " + obj2.name + " " + "Age = " + obj2.age);
    }
}
