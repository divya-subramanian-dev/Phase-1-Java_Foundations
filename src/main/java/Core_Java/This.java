/*
LOCAL VARIABLE: A variable created inside methods or variable passed as parameter 
INSTANCE VARIABLE : A variable create inside class outside method

USE SAME VARIABLE NAME IN BOTH:-
If want to use same variable name for both local and instance variable is this possible - no jvm get confused whether that name is local or instance right
EX: here left side refer as local and right side is instance right but java get confused
private int age;
public void setAge(int age) 
{
    age = age;
}

PASSING REFERENCE AS PARAMETER:-(it works but )
If java want to know which is local and which is reference ,main thing to differnetiate is object right , for instant variable is always called by using object 
if we pass that object reference as parameter and assign local variable to that , thats wrks right 
EX:
class Human
{
    private int age;
    public void setAge(int age,Human obj) 
    {
        obj.age = age;
    }
}
public class This 
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(22,obj);
    }
}

THIS KEYWORD:
passing reference to parameter is working but java tells why want to pass object 2 times , 
EX: 
obj.setAge(22,obj);
To avoid that java give you a "THIS" keyword it refers to current object and this reference always assign to local variable
EX:
class Human
{
    private int age;
    public void setAge(int age) 
    {
        this.age = age;
    }
}
public class This 
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(22);
    }
}

*/

class Human
{
    private int age;
    private String name;

    public int getAge() 
    {
        return age;
    }
    public void setAge(int age) 
    {
        this.age = age;
    }
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
}
public class This 
{
    public static void main(String args[])
    {
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Divya");
        System.out.println("name = " + obj.getName());
        System.out.println("Age = " + obj.getAge()); 
    }
}
