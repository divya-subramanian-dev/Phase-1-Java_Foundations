// Method overloading - create multiple methods with same but with different number of parameters and different data type of parameters
class calculator
{
    public int add(int num1,int num2)
    {
        return num1 + num2;
    }
    public int add(int num1,int num2,int num3)
    {
        return num1 + num2 + num3;
    }
    public double add(double num1, double num2)
    {
        return num1 + num2;
    }
}
public class MethodOverloading
{
    public static void main(String args[])
    {
        calculator calc = new calculator();
        //int result = calc.add(4,5);
        double result = calc.add(4.0,5.8);
        System.out.println("Addition of 2 numbers = " + result);
    }
}