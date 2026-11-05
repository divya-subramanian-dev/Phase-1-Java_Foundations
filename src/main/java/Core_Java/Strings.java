/*
STRING:-
String is a class ,it has more fields and methods in class, if want to use string class want to create object and pass values in it as arguments
String class is used as reference type likewise primitive type ex: reftype varname = value; 
string has more methods because it is a class ,we use it by creating object ex refname.method();
string is immutable , once stored data for one variable not able to chnage that
there is no specific size capacity in string - based on value we give it take space accordingly - it take continuous memory space , right , now want to expand the string
value in future means not possible because of continuous memory , if there is no space near it in future , it leads to relocation because of that string not allow changes 
in value once created.

STRING CONSTANT POOL:-
string constant pool present in heap memory
name - check whether "navin" data already present in memory if not create string object in heap memory's string constant pool with address 101
name 1 - check whether "pravin" data already present in memory if not create string object in heap memory's string constant pool with address 103
s1 - check whether "Navin" data already present in memory if not create string object in heap memory's string constant pool with address 105
s2 - check whether "Navin" data already present in memory , yes already present so no new object is created use same reference address 105
name - already for name varibale have data now that not changed only add that data in pool with different address now in pool have both data for name variable as 107
after sometime 1st data for name is removed by garbage collection
like wise string constant pool save the memory space

STACK:-
1st for main method stack memory is created
name - 101(removed) , 107(added)
name1 - 103
s1 - 105
s2 - 105

*/
public class Strings 
{
    public static void main(String args[])
    {
        // Create string object with new keyword
        System.out.println("Create string object with new keyword");
        String name = new String("navin");
        System.out.println("String object = " + name);
 
        // Create string object without new keyword
        System.out.println("Create string object without new keyword");
        String name1 = "pravin";
        System.out.println("String reftype = " + name1);

        //Understanding String constant pool in heap memory
        System.out.println("Understanding String constant pool in heap memory");
        String s1 = "Navin";
        String s2 = "Navin";
        System.out.print("is s1 and s2 are same = ");
        System.out.println(s1 == s2);

        //Understanding String constant pool in heap memory
        System.out.println("Understanding String constant pool in heap memory");
        name = name + "reddy";
        System.out.println("Try to change the string data = " + name);

        //Using string methods
        System.out.println("Using string methods");
        String data = "harini";
        System.out.println("take string value at index 1 = " + data.charAt(1));
        System.out.println("check length of string = " + data.length());
    }
}
