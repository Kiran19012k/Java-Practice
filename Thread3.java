class Counter
{
    int count;
    public synchronized void increment()
    {
        count++;
    }
}
// class A implements Runnable
// {
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
//             c.increment();

//         }
//     }
// }
// class B implements Runnable
// {
//     public void run()
//     {
//         for(int i=1;i<=5;i++)
//         {
            
//         }

//     }
// }
public class Thread3 {
    public static void main(String[] args) throws InterruptedException {

        Counter c=new Counter();

        Runnable r1=new Runnable() {
            public void run()
            {
                 for(int i=1;i<=1000;i++)
                 {
                     c.increment();

                 }
            }
            
        };

        Runnable r2=new Runnable() {
            public void run()
            {
                 for(int i=1;i<=1000;i++)
                  {
                     c.increment();

                  }
            }
        };

        

        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);
        
    }
    
}
