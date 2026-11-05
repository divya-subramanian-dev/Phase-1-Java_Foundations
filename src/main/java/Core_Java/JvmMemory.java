class calculator
{
    int num = 5;
    public int add(int num1,int num2)
    {
        System.out.println("Instance variable  = " + num);
        return num1 + num2;
    }
}
public class JvmMemory
{
    public static void main(String args[])
    {
        int n1 = 4;
        int n2 = 5;
        calculator calc = new calculator();
        calculator calc1 = new calculator();
        int result = calc.add(n1,n2);
        System.out.println("Addition of 2 numbers = " + result);
        calc.num = 8 ;
        System.out.println("Call instance var by object calc = " + calc.num);
        System.out.println("Call instance var by object calc1 = " + calc1.num);
    }
}

/*
JVM MEMORY SPACES :-
memory space present in JVM to store the objects , variables , methods 
there are 2 types of memory spaces in JVM they are -  Stack and heap memory

STACK memory :- 
last in first out (store data in sequence) 
stack memory created for each method

Main method : create stack memory with 2 column and required rows 
local variable n1 - store n1 in one col 4 in 2nd col
local variable n2 - store n2 in one col 5 in 2nd col
object calc - store calc refname in one col and store reference number 101 in 2nd col(this link to heap memory)
object calc1 - store calc1 refname in one col and store reference number 105 in 2nd col(this link to heap memory)
result method call - now create stack memoery for add method do calcalation return result in 7 in 2nd col

add method 
local variable num1 - store num1 in one col 4 in 2nd col
local variable num2 - store num2 in one col 5 in 2nd col

HEAP memory:-
It stores the instance variable and object in heap memory
Each object are separate from each other there is no link with object to object
heap memory link with stack memory for each object by its reference address 
EX:
instance variable num - store it in heap memory with each object individually
object calc - store in heap with respective instance variable and store its method call and instance variable call (store with reference address 101)
object calc1 - store in heap with respective instance variable and store its method call and instance variable call (store with reference address 105)
EX:
i have 2 samsung phone , if one phones glass broken is that affect other phone - definitely no right likewise each object is separate from each other 
changes done in one not affect other
*/


