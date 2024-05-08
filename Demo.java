class Mobile {
        String brand;
        int price;
        static String type;
    
    void show()
    {
        System.out.println(brand+":"+price+":"+type);
        System.out.println("show");
    }
    static{
        type="phone";
        System.out.println("static");
    }

    // static void show1(Mobile obj)
    // {
    //     System.out.println(obj.brand+":"+obj.price+":"+obj.type);
    //     System.out.println("showww1");
    // }
}

public class Demo {
    
    public static void main(String args[]) throws ClassNotFoundException
    {
        Class.forName("Mobile");
         
        
            
        
        // Mobile obj1=new Mobile();
        // obj1.brand="apple";
        // obj1.price=100;
        // Mobile.type="phone";

        // Mobile obj2=new Mobile();
        // obj2.brand="iqoo";
        // obj2.price=78;
        // Mobile.type="smart phone";

        // obj1.show();
        // obj2.show();

        // Mobile.show1(obj1);
    }
}
