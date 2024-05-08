class A{
    public void show()
    {
        System.out.println("In A");
    }
    
}
    public class AnInner {
    public static void main(String[] args) {
        A obj=new A()
        {
            public void show()
            {
             System.out.println("In B");
            }
           

        };
        obj.show();
        
        
    }
    
}
