interface Computer
{
     public  void code();
    
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("coding,compile,run faster..");
    }
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("coding,compile,run");
    }
}



class Developer
{
    public void devApp(Computer comp)
    {
        comp.code();
    }
}
    public class Interface1 {
    public static void main(String[] args) {

        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Developer kk=new Developer();
        kk.devApp(lap);
    }
    
}
