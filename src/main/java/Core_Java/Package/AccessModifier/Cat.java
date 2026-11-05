package Package.AccessModifier;

public class Cat 
{
    int age = 3; // Default access modifier, accessible within the same package
    private String breed = "Persian"; // private access modifier, accessible only within the Cat class

    public static void main(String a[])
    {
        Cat cat = new Cat();
        System.out.println("age of cat in same class = " + cat.age); // default access modifier, accessible within the same package
        System.out.println("breed of cat in same class = " + cat.breed); // Tbreed is private so it can be accessed only within the Cat class
    }
}


