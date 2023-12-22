class a014_Student
{
    int rollNo;
    String name;
    int marks;
}

public class a014_EnhancedForLoop {
    public static void main(String[] args) {
        
        a014_Student s1 = new a014_Student();
        s1.rollNo = 1;
        s1.name = "Joe";
        s1.marks = 88;

        a014_Student s2 = new a014_Student();
        s2.rollNo = 2;
        s2.name = "Michael";
        s2.marks = 67;

        a014_Student s3 = new a014_Student();
        s3.rollNo = 3;
        s3.name = "Lucy";
        s3.marks = 97;

        a014_Student students[] = new a014_Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        

        for(a014_Student s : students)
        {
            System.out.println(s.rollNo + " : " + s.name + " : " + s.marks);
        }

    }
}
