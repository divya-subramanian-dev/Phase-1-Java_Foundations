/* 
ANONYMOUS OBJECT CREATION:-
- when object is required only once use anonymous object creation 
- Not possible to reuse this object because no reference name is there to call it again
EX:
Student obj = new Student(); 
- here Student obj is a reference creation
- new Student();  is the object creation 
- In anonymous object we going only create a object without reference name 
*/

class Student
{
    String name = "Divya";
    int rollNo = 27;

    public void show()
    {
        System.out.println("Roll No = " + rollNo + "," + "Name = " + name);
    }
}
public class AnonymousObject 
{
    public static void main(String args[])
    {
        new Student().show();
        new Student().show();
    }
    
}
