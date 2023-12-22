
class a013_Student
{
    int rollNo;
    String name;
    int marks;
}

public class a013_ArrayOfObjects {
    public static void main(String[] args) {
        
        a013_Student s1 = new a013_Student();
        s1.rollNo = 1;
        s1.name = "Joe";
        s1.marks = 88;

        a013_Student s2 = new a013_Student();
        s2.rollNo = 2;
        s2.name = "Michael";
        s2.marks = 67;

        a013_Student s3 = new a013_Student();
        s3.rollNo = 3;
        s3.name = "Lucy";
        s3.marks = 97;

        // If we want to create an array that has different variable types, we can not do it directly.
        // We can create a class and create an array of this classes' objects. 
        a013_Student students[] = new a013_Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].rollNo + " : " + students[i].name + " : " + students[i].marks);
        }


    }
}
