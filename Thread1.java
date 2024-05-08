class A extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("hi");
           try{
             Thread.sleep(100);
           }
           catch(Exception e)
           {
            e.printStackTrace();
           }
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("hello");
            try{
             Thread.sleep(100);
           }
           catch(Exception e)
           {
            e.printStackTrace();
           }
        }
    }
}
public class Thread1 {
    public static void main(String[] args) {

        A obj1=new A();
        B obj2=new B();

        obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
        
    }
    
}
