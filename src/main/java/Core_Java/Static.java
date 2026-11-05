/* 

NEED OF STATIC KEYWORD:-
- If a variable have common value for all objects then make that variable as static 
- static keyword  make that variable common for all object
- If do changes in that common static variable ,that affects for all object because that is common for all objects right
- so static variable is shared by all objects 
- static variable is common for all objects so by common we call that variable using class name not by object name 
   Ex: Mobile.name not obj.name ,obj1.name

MEMORY AREA OF STATIC VARIABLES:-
static varaibles are stored in different memory area in JVM 
that are separate from stack and heap memory

STATIC VARIABLE:-
- static keyword means making the variable as class member not object member
- it saves memory because make this variable as common not use same value multiple times for each object 
Example:
class Mobile
{
    String brand; // have separate value for each object (instance variable)
    int price; // have separate value for each object (instance variable)
    static String name; // common value for each object make it static (static variable)
}
public class Static 
{
    public static void main(String args[])
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone"; // same value for all object

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 2500;
        Mobile.name = "Smartphone"; // same value for all object

        Mobile.name = "phone"; // for all object change name from smartphone to phone
    }
}

STATIC METHOD:-
- if we use normal instance method, to call that method need to create object for it EX : obj1.show();
- but we make that method as static no need to create a object , just call it by using class name EX : Mobile.show1();
- but in static method instance variables are not allowed because ,java get confused what is that variables are because it dont know 
  which object that variables refer too right 
    EX: it shows error in brand and price that are instance variable depend on object values get changed java doesnt know which object that refers too
    public static void show1(Mobile obj1) // static method
    {
        System.out.println("Brand = " + brand + "," + "Price= " + price + "Name = " +"," + name);
    }
- To avoid that confusion, we can pass object reference as parameter ok
    EX: now java knows which object those variables refers too
    public static void show1(Mobile obj1) // static method
    {
        System.out.println("Brand = " + obj1.brand + "," + "Price= " + obj1.price + "Name = " +"," + name);
    }
- to call static method no nedd to object so that only we use static keyword in main method, if not use that ,main mehtod is the main execution point , 
  if this method not executed then how to create object for that to call the same method - it cause deadlock right
  EX :
  public static void main(String args[]){}


STATIC BLOCK:-
we see constructor concept right This constructor also assign these 3 deafult values for each object separately while create object right
but name variable have common value no need to assign it for each object right again same concept of static keyword 
here we use static block to assign value to that variable only once 
static block execute only once in the program and this block execute at the 1st before constructor ,before any methods 
static block executed after class creation itself

PROGRAM EXECUTION:-
main method - starting point of program
Class loads - when sees obj creation class loads once EX :  Mobile obj1 = new Mobile(); -in this line class loades by class loader 
static block - execute static block it initialize static variables
object creation - create new object in heap memory
constructor calls - assign default value to instance variables
method calls - method called using object reference

CLASS LOADER:-
In case , for that class , even one object creation is not initialized EX : Mobile obj1 = new Mobile(); - this line not present then class is not loaded
static block not executed 
we learn that right, object creation not need for static block ,static mehtod ,static variables only class is needed for that but now even one object new line is not present 
then class is not loaded for that we neede to load it using "Class" class with forname() method pass class name as parameter - this will load the class execute static block.
EX:
class Mobile
{
    static String name; 
    static 
    {
        name = "phone";
        System.out.println("in static block");
    }
    public Mobile()
    {
        name = "phone";
        System.out.println("in constructor block");
    }
}
public class Static 
{
    public static void main(String args[])
    {
        Class.forName("Mobile"); - this load the class
        Mobile.show1(obj1);
    }
}

*/

class Mobile
{
    String brand; // have separate value for each object (instance variable)
    int price; // have separate value for each object (instance variable)
    static String name; // common value for each object make it static (static variable)

    static 
    {
        name = "phone";
        System.out.println("in static block");
    }
    public Mobile()
    {
        brand = "";
        price = 1500;
        name = "phone";
        System.out.println("in constructor block");
    }

    public void show() // instance method
    {
        System.out.println("Brand = " + brand + "," + "Price= " + price + "," + "Name = " +"," + name);
    }
    public static void show1(Mobile obj1) // static method
    {
        System.out.println("Brand = " + obj1.brand + "," + "Price= " + obj1.price + "," + "Name = " +"," + name);
    }
}
public class Static 
{
    public static void main(String args[]) throws ClassNotFoundException
    {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        Mobile.name = "Smartphone"; // same value for all object

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 2500;
        Mobile.name = "Smartphone"; // same value for all object

        Mobile.name = "phone"; // for all object change name from smartphone to phone

        //Class.forName("Mobile"); //  this load the class

        obj1.show(); // calling instance method using object name 
        obj2.show();
        Mobile.show1(obj1);
    }
}
