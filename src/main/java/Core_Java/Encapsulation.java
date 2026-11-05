/*

ENCAPSULATION:-
Encapsulation is like a capsule inside that medicine are tightly closed likewise in program 
use encapsualtion to make fields private from other classes to hide that important fields methods from 
other classes.
Ex:
we are humans , we have some data in our brain like what is my name in our brain stored like name = "divya" if
anyone ask about my name i tell divya right like if anyone ask about my bank account password 
i didnt tell that becuase that is privacy no need to tell them and if they want to
know about my password 1st they want to ask to me i decide whether want to tell them or not
that is called encapsualtion.

PRIVATE: that variable or method only accessible within that class
GOOD PRACTICE : Every time while creating a instance variable make it private

GETTER SETTER METHODS :-
If make every field private , it affect our purpose of creating that field right if no one acces that
field what is use of it .for this answer is getter setter methods 
setter = set the value for that variable in this method (by call this public method set value)
getter = return the value for this vatribale in this method (by call this public method get value)

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
public class Encapsulation 
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
