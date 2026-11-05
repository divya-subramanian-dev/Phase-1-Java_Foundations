/*

POLYMORPHISM :-
poly means many and morphism means behaviour. So polymorphism means many behaviours. 
In java, polymorphism is the ability of an object to take on many forms. 
The most common use of polymorphism in OOP occurs when a parent class reference is used to refer to a child class object.
EX:
based on situation we behaves differently and names also changed based on situation,
in home ,i am daughter, in office i am collegue,in college i am student based on place 
my behaviour chnages

TYPES OF POLYMORPHISM:-
1. Method overloading:-
    Compile type polymorphism also called as early binding - 
    define your behaviour early , define which method want to execute in compile time
2. Method overriding:-
    Run time polymorphism also called as Late binding - 
    define which method want to execute in runtime

*/
// ==================== METHOD OVERLOADING ===================================
// In this method overloading - compile time itself decide from these 2 methods 
// what want to execute based on num of parameter and type of parameter
class compiletime
{
    public void show()
    {
        System.out.println("method overloading without param");
    }
    public void show(int num)
    {
        System.out.println("method overloading with param = " + num);
    }
}

// ==================== METHOD OVERRIDING ===================================
// In this method overriding - at run time itself decide 
// what method want to execute .whether execute parent or child class method?
class parRuntime
{
    public void show()
    {
        System.out.println("method overriding in parent class");
    }
}
class childRuntime extends parRuntime
{
    public void show()
    {
        System.out.println("method overriding in child class");
    }
}

// ==================== MAIN METHOD ===================================
public class Polymorphism 
{
    public static void main(String args[])
    {
        compiletime ct = new compiletime();
        ct.show();
        ct.show(5);

        childRuntime crt = new childRuntime();
        crt.show();
    }
}
