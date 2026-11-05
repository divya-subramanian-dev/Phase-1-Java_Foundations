/*
NEED OF ARRAY:-
variable store a single value,if want to store multiple values want to create multiple variables
Array store multiple values in single variable 
Array is a object ,it created using new keyword , it store in heap memory

variables :
int i =5;
int j =6;
int k =7;

Array :
int num[] = {5,6,7};
int num[] = new int[4];
size of array id fixed not able to chnage size after creation of array
array index pointer starts with 0.using index able to access the array values.

Matrix:
int num[][] = new int[3][4];
it is two dimensional or multi dimensional array 
it stores array with same size in row and columnns like if have 3 rows with 4 elements in each array (4 columns)

JAGGED ARRAY:
the number of elements stored in each array is not fixed , it not same in all array in matrix
indivuadullay for every column specify the size of elements 

CREATE ARRAY WITH REFERENCE TYPE:
create array with reference type is same as normal primitive type only difference is 
creating array is same
must want to create object and pass values for variables
print the values of reference type array small different

DRAWBACKS OF ARRAY:
1.while store in heap memory , array store its values continously memory in sequence order so size is fixed
infuture want to expand this array not possible ,only way is create new array with required size and copy old and add new values 
but this also consume time and computations will happens.
2. every time searching element it traverse whole array so it time consuming
3. only possible to create array with same type of elements not posiible with diff data type

SOLUTION FROM ARRAY :
collections is solution for drawback of array
*/

class Student
{
    int rollno;
    String name;
    int marks;
}
public class Arrays 
{
    public static void main(String args[])
    { 
        // ================ Create one dimensional array  ================
        System.out.println();
        System.out.println("Create one dimensional array");
        System.out.println("if values alreay know create array with values in braces");
        //create a array like below if know values already
        int nums[] = {3,7,2,4};
        //access array value using index position
        System.out.println("value at index 0 of nums array = " + nums[0]);
        // update values of array using index
        nums[1] = 10;
        System.out.println("value at index 1 of nums array = " + nums[1]);

        System.out.println("if values not known create array with size then assign values");
        // if array values are not previously know 
        int arrs[] = new int[4];
        arrs[0] = 4;
        arrs[1] = 8;
        arrs[2] = 3;
        arrs[3] = 9;
        System.out.println("value at index 2 of arrs array =" + arrs[2]);

        // if want to display all values in array - use for loop
        System.out.println("arrs array elements are : ");
        for(int i=0;i<4;i++)
        {
            System.out.println(arrs[i]);
        }


        // ================ Create multidimensional array - multiple array with one variable name ================
        System.out.println();
        System.out.println("Create two dimensional array");
        int matrix[][] = new int[3][4];
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //================ use for each loop to display values ================
        System.out.println("for each loop to display values of matrix:");
        for(int mat1[] : matrix)
        {
            for(int mat2 : mat1)
            {
                System.out.print(mat2 + " ");
            }
            System.out.println();
        }


        // ================ Three dimensional array ================
        System.out.println();
        System.out.println("three dimensional array");
        int tri[][][] = new int[3][4][5];
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    tri[i][j][k] = (int)(Math.random() * 10);
                }
            }
        }
        for(int i=0; i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                for(int k=0;k<5;k++)
                {
                    System.out.print(tri[i][j][k]+" ");
                }
            }
            System.out.println();
        }


        //================ jagged array ================
        System.out.println();
        System.out.println("jagged array");
        int jagg[][] = new int[3][];
        jagg[0] = new int[3];
        jagg[1] = new int[4];
        jagg[2] = new int[2];

        for(int i=0; i<jagg.length;i++)
        {
            for(int j=0;j<jagg[i].length;j++)
            {
                jagg[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int jag1[] : jagg)
        {
            for(int jag2 : jag1)
            {
                System.out.print(jag2 + " ");
            }
            System.out.println();
        }

        //============= CREATE ARRAY WITH REFERENCE TYPE =============
        System.out.println( );
        System.out.println("CREATE ARRAY WITH REFERENCE TYPE");
        //create 3 objects and assign values for instance varibale of each object
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "navin";
        s1.marks = 88;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "pravin";
        s2.marks = 97;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "harini";
        s3.marks = 67;

        // create object with refernece type
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        System.out.println("for loop:");
        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
        System.out.println("for each loop:");
        for(Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.marks);
        }





        
    }
}
