 final class Calc
{
      final void show()
    {
        System.out.println("in calc");
    }
}
class AdvCalc extends Calc {

     void show()
    {
        System.out.println("in Advcalc");
    }


}
public class Final1 {
    public static void main(String[] args) {
          
        // final  int a=10;  
        //  System.out.println(a);

        AdvCalc obj=new AdvCalc();
        obj.show();
    }
    
}
