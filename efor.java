import java.util.Scanner;
/**
 s Student
 */
 class Student {
    int rollno;
    String name;

    
}

public class efor {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        Student s1=new Student();
         s1.rollno=01;
         s1.name="kiru";

        Student s2=new Student();
         s2.rollno=02;
         s2.name="ki";

        Student stud[]=new Student[2];

        stud[0]=s1;
        stud[1]=s2;

        for(Student studs : stud)
        {
            System.out.println(studs.rollno+" "+studs.name);
        }



        // int size=sc.nextInt();

        // int arr[]=new int[size];

        // arr[0]=1;
        // arr[1]=2;
        // arr[2]=3;


        // for(int n : arr)
        // {
        //     System.out.println(n);
        // }

    }

    
}
