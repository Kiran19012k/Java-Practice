interface A
{
    int age=10; //final  variables
    String name="max";

    public void show();
    public void config();

}
interface X
{
    public void run();
}
interface Y extends X
{

}
class B implements A,X
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("running");
    }
}
public class Interface2 {
    public static void main(String[] args) {
        A obj;
        obj=new B();
        obj.config();
        obj.show();
        X obj1=new B();
        obj1.run();

        System.out.println(A.age);
    }
    
}
