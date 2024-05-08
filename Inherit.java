class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
    public int sub(int n1,int n2)
    {
        return n1-n2;
    }
}
class AdvCalc extends Calc
{
    public int mult(int n1,int n2)
    {
        return n1*n2;
    }

    public int div(int n1,int n2)
    {
        return n1/n2;
    }
}
class VadvCalc extends AdvCalc
{
    public double pow(int n1,int n2)
    {
        return Math.pow(n1, n2);
    }
}
public class Inherit {
    public static void main(String[] args) {

        VadvCalc obj=new VadvCalc();
        int r1=obj.add(5,4);
        int r2=obj.sub(6,4);
        int r3=obj.mult(5,5);
        int r4=obj.div(10, 5);
        double r5=obj.pow(5,5);

        System.out.println(r1+" "+r2+" "+r3+" "+r4+" "+r5);
        
    }
    
}
