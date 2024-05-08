class A{
    public A()
    {
        
        System.out.println("in A");
        
    }

    public A(int n)
    {
        this();
        System.out.println(n);
    }

}
class B extends A {
    public B()
    {
        
        System.out.println("in B");
    }

    public B(int n)
    {
        super(6);
        
        System.out.println(n);
    }
}

    
public class SuperThis {
    public static void main(String[] args) {

        B obj=new B(5);
        

        
    }
    
}
