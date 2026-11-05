/* 
OBJECT CLASS :-
- In java every class extends the object class
- Even if we dont write like class A extends Object by default it extends object class
EX:
class A extends Object
{
}
class B extends A
{
}

SUPER METHOD:-
- Even we didnt use super method by default it call at start of every constructor 
- while create object for child class it call 'B' child class constructor ,inside that super() method called so 1st execute constructor of 'A' parent class 
  then execute 'B' constructor
- super method used to call the parent class constructor
PASSING PARAMETER:-
- BY default super method execute only default constructor of parent class
- In super method itself pass parameter value it use the parameterized constructor of parent class 
EX:
class A extends Object
{
    public A()
    {
        super();
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("In A  = " + n);
    }

}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n)
    {
        super();
        System.out.println("In B  = " + n);
    }
}
public class SuperKeyword 
{
    public static void main(String args[])
    { 
        B obj = new B();
    }
}

THIS METHOD:-
- this method used to call the same class constructor 
- incase want to call both constructor in class use this mehtod
EX: 
class A extends Object
{
    public A()
    {
        super();
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("In A  = " + n);
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n)
    {
        this();
        System.out.println("In B  = " + n);
    }
}
public class SuperKeyword 
{
    public static void main(String args[])
    { 
        B obj = new B(5);
    }
}
HERE 
- while create object call parameterized constructor of B class
- inside call this() - default constructor of B class
- inside default constructor of B class called default constructor of A class
- IN this case execute both constructor of B class with default constructor of A class

*/

class A extends Object
{
    public A()
    {
        super();
        System.out.println("In A");
    }
    public A(int n)
    {
        super();
        System.out.println("In A  = " + n);
    }

}
class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int n)
    {
        //super(n);
        this();
        System.out.println("In B  = " + n);
    }
    public void show()
    {
        System.out.println("Hii Java");
    }
}
public class SuperKeyword 
{
    public static void main(String args[])
    { 
        B obj = new B(5);
        obj.show();
    }
}
