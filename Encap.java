import java.util.Scanner;
class Student
{
    private int age;
    private String name;

    void setAge(int age)
    {
        this.age=age;
    }

    void setName(String n)
    {
        name=n;
    }

    int getAge()
    {
        return age;
    }

    String getName()
    {
        return name;
    }

}
    public class Encap {
        public static void main(String[] args) {
            Student st=new Student();

            Scanner sc=new Scanner(System.in);

            int a=sc.nextInt();
            String n=sc.next();

            st.setAge(a);
            st.setName(n);
            


            System.out.println(st.getAge()+":"+st.getName());
        }
    
    }
