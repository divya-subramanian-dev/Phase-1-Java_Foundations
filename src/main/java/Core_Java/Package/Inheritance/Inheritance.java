/*
IS RELATIONSHIP:-
AdvancedCalc(child class) IS Calc(parent class) 
Ex: parent money is also my money in my childhood 

NEED OF INHERITANCE:-
- i have a calcualtor with addition and subtraction i seel this woth cost of 250
- if some one ask advanced calcualtor with division and multiplication and also with basic calc i create separate calcualtor for this i sell with 500
- now i have 2 separate products to sell one is 250 other is 500 so it benifits me so i use inheritance concept
- I have basic calc class - if any need i sell this
- I have advanced calc class with basic calc -  if anyone need i sell this 
- If i write advance cals also in basic clac class - it make complication also 

EXTEND KEYWORD:-
- To connect two classes use extend keyword ,extend in child class with parent class name

TYPES OF INHERITANCE:-
1. SINGLE INHERITANCE - AdvCalc extends Calc
2. MULTILEVEL INHERITANCE - VeryAdvCalc extend AdvCalc extends Calc
3. HIERARCHICAL INERITANCE - VeryAdvCalc and AdvCalc both extends Calc
4. MULTIPLE INHERITANCE - VeryAdvCalc extend AdvCalc and VeryAdvCalc extend Calc (IS THIS POSSIBLE)
   
WHY MULTIPLE INHERITANCE NOT WORKS :-
EX: this not works in java
   class A (parent)
   {
     abc()
     x()
   }
   class B (parent)
   {
      show()
      x()
   }
   class C extends A,B (child)
   {
     
   }
   main() - Ambiguity problem (confuse which to choose) so this concept is removed from java 
   {
    C obj = new C()
    obj.show() - i dont have show method me, i ask my parents ,check 'B' have show() take it 
    obj.abc(); - i dont have abc method with me, i ask my parents ,check 'A' have abc() take it 
    obj.x() - i dont have x method with me , i ask my parents , check both 'A' and 'B' class have 'X method' in this case get clash which method to choose?
   }

NOTES:-
we create multiple classes with different features with extends keyword connect two classes
but while creating object we have confusion want to create object foe which class
- ALWAYS WANT TO CREATE OBJECT FOR CHILD CLASS (that have both parent + child features)

*/

//import Calculator.VeryAdvCalc; // it import veryadvcalc file from calculator folder
import java.lang.System; // it import system class from java.lang package
import Calculator.*; // it import all files present in this folder

public class Inheritance 
{
    public static void main(String args[])
    {
        // createa object for child class - access both class methods
        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(4,5);
        int r2 = obj.add(7,3);
        int r3 = obj.multi(5,3);
        int r4 = obj.div(15,4);
        double r5 = obj.pow(2,3);
        System.out.println("Addition = " + r1 + "," + "Subraction = " + r2 + "," + "Multiplication = " + r3+"," + "Division = " + r4 + "," + "Power = " + r5);
    }
}

