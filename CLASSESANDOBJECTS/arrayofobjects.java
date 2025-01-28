class Student
{
int rollNo;
String name;
int marks;
}

public class arrayofobjects {
    public static void main(String[] args) 
    {
         Student s1 = new Student ();
         s1.rollNo = 1;
         s1.name = "Rahul";
         s1.marks = 90;

         Student s2 = new Student ();
         s2.rollNo = 2;
         s2.name = "Mathew";
         s2.marks = 70;

         Student s3 = new Student();
         s3.rollNo = 3;
         s3.name = "Monstreat";
         s3.marks = 50;

         Student students [] = new Student[3];
            students[0] = s1;
            students[1] = s2;
            students[2] = s3;

        // for(int i=0; i<students.length; i++)
        // {
        //     System.out.println(students[i].rollNo + " : " + students[i].name+" : " + students[i].marks);
        // }

        for (Student student : students) 
        {
            System.out.println(student.rollNo + " : " + student.name+" : " + student.marks);
            // System.out.println(student);
        }        // int nums[] = new int[5];
        // nums [0] = 4;
        // nums [1] = 2;
        // nums [2] = 9;
        // nums [3] = 6;
        // nums [4] = 7;

        // // instead of specifying the array length i<6 just use the nums.length

        // for(int i=0; i<nums.length; i++)
        // {
        //     System.out.println("Element at index " + i + " is " + nums[i]);
        // }
    }
    
}
