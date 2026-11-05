package Package.AccessModifier;
import Package.AccessModifier.Animals.*;

class TinyDog extends Dog
{
    public void showColor()
    {
        System.out.println("color of dog in sub class = " + color);
    }
}
public class AccessModifier 
{
    public static void main(String a[])
    {
        Dog dog = new Dog();
        System.out.println("age of dog in diff package = " + dog.age); // make it as public to access it from different package

        Cat cat = new Cat();
        System.out.println("age of cat in same package = " + cat.age); // default access modifier, accessible within the same package
        //System.out.println("breed of cat in same package = " + cat.breed); // This line will cause a compilation error because 'breed' is private in Cat class

        TinyDog tinyDog = new TinyDog();
        tinyDog.showColor(); // color is protected in Dog class and it can be accessed from sub class of different package
    }
}
