package Package.AccessModifier.Animals;

class Launch
{
    public void abc()
    {
        Dog dog = new Dog();
        System.out.println("color of dog in same package = : " + dog.color);
    }
}
public class Dog 
{
    public int age = 5;
    String breed = "Golden Retriever";
    protected String color = "Golden";
}
