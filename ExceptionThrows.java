class A
{
    public void show() throws ClassNotFoundException
    {
        Class.forName("hello");
    }
}

public class ExceptionThrows {
    static{
        System.out.println("in static");
    }
    public static void main(String[] args) {
        
        A obj=new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
