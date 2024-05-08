class Student{
    int age;
    String name;

    public Student() {
        age=23;
        System.out.println(age);
    }

    public Student(String n)
    {
        name=n;
        System.out.println(n);
    }

    public Student(String n,int a)
    {
        name=n;
        age=a;
        System.out.println(n+a);
    }
    
}   
    public class Construct {
        public static void main(String[] args) {

            Student obj=new Student();
            Student obj1=new Student("kiru");
            Student obj2=new Student("kiru",13);

            
        }
    
}
