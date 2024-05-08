import java.util.Scanner;
class Student{
    int rollno;
    String name;
    int marks;
}

public class aob {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        Student s1=new Student();

        
        
        s1.rollno=sc.nextInt();
        s1.name=sc.next();
        s1.marks=sc.nextInt();
        

        Student s2=new Student();
        s2.rollno=02;
        s2.name="navi";
        s2.marks=98;

        Student s3=new Student();
        s3.rollno=03;
        s3.name="kiran";
        s3.marks=96;

        

        Student students[]=new Student[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].rollno+" "+students[i].name+" "+students[i].marks);
        }
        

    }
    
}
