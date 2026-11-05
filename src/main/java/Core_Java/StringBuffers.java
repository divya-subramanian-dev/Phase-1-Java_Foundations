/*
STRING BUFFER CLASS:-
It is mutable string class , it allow to change the values of string after object creation for that string
It has size capacity of 16 always - if create object with data it take continuous memory space , right , now want to expand the string
value in future means not possible because of continuous memory , if there is no space near it in future , it leads to relocation because of that stringbuffer always maintain 
extra 16byte space near that string
It is thread safe - about thread learn in future
it is lot of methods to use , because this is class Ex: find length of buffer,append data at end, insert data at specific position, delete data at specific position,
set the capacity of buffer etc.

STRING BUILDER CLASS:-
it is excatly same as string buffer class , only one difference is , it is not thread safe , otherwise everything is same.

*/
public class StringBuffers 
{
    public static void main(String args[])
    {
       // STRING BUFFER CLASS
       System.out.println("STRING BUFFER CLASS");
       StringBuffer buffer = new StringBuffer();
       System.out.println("check buffer default size = " + buffer.capacity());//by default have 16byte space
       StringBuffer buffer1 = new StringBuffer("Divya");
       System.out.println("check buffer size after add data = " + buffer1.capacity()); //maintain extra 16 spaces
       System.out.println("Append data at end = " + buffer1.append(" Subramanian")); // append data
       System.out.println("Insert data at specific pos = " + buffer1.insert(0,"Dev "));
       System.out.println("Delete data at specific pos = " + buffer1.deleteCharAt(7));

       // STRING BUILDER CLASS
       System.out.println(" ");
       System.out.println("STRING BUILDER CLASS");
       StringBuilder builder = new StringBuilder();
       System.out.println("check builder default size = " + builder.capacity());//by default have 16byte space
       StringBuffer builder1 = new StringBuffer("Divya");
       System.out.println("check builder size after add data = " +builder1.capacity()); //maintain extra 16 spaces
       System.out.println("Append data at end = " + builder1.append(" Subramanian")); // append data
       System.out.println("Insert data at specific pos = " + builder1.insert(0,"Dev "));
       System.out.println("Delete data at specific pos = " + builder1.deleteCharAt(7));
    }
}
