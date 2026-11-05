/*
PRIMITIVE TYPE:-
primitive type is not a object so java is not purely object oriented programming ,
every class in java extends object class but not primitive types.
actually this is good because no need to store it as object in heap memory , it saves time.

INTRODUCE OF WRAPPER CLASSES:-
- certain frameworks in java, only use objects not primitive types Ex :collection framework only use object type
- so we wrapper class is introduced
- For every primitive type have a class for it (wrapper class), that class extends object class

PRIMITIVE WRAPPER
byte - Byte
int  - Integer
long - Long
short - Short
char - Character
double - Double
float - Float
boolean - Boolean

AUTOBOXING:-
- every time taking a primitive value store it in object is called boxing
Ex: boxing
int num = 7 ; // primitive variable
Integer num1 = new Integer(num);  //wrapper class extend object class
Ex: Autoboxing
int num = 7 ; // primitive variable
Integer num1 = num ;  //wrapper class extend object class

UNBOXING:-
- every time storing the object class into primitive type
int number = y1.intValue();

*/
public class WrapperClass 
{
    public static void main(String args[])
    {
        // ================== AUTOBOXING =======================
        int x = 7 ; // primitive variable
        //Integer x1 = new Integer(x); // this is class so create like object with new keyword 
        System.out.println("boxing  = " + x);

        int y = 8 ; // primitive variable
        Integer y1 = y ;  //wrapper class extend object class
        System.out.println("Auto boxing  = " +  y1);

        // ================== AUTO UNBOXING =======================
        int number = y1.intValue();
        System.out.println("Unboxing  = " +  number);

    
    }
}
