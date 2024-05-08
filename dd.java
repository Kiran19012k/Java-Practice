class calc{
        int add(int n1,int n2)
        {
            int r=n1+n2;
            return r;
        }
    }
public class dd {
    public static void main(String args[]){
    // int i=5;

    // while(i<=5)
    // {
    //     System.out.println(i);
    //     i++;
    // }

    // do {
    //     System.out.println(i);
    //     i--;
    // }
    // while(i>0);

    // for(int i=5;i>0;i--)
    // {
    //     System.out.println(i);
    // }
   int num1=5;
   int nuim2=10;

   calc cal=new calc();
   int res=cal.add(num1, nuim2);
   System.out.println(res);
    
}

}
