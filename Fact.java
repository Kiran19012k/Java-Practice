import java.util.Scanner;

public class Fact {

    static int  fact(int n)
    {
        if(n==0 || n==1)
                return n;
        else
            return n*fact(n-1);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        n=sc.nextInt();
        
        System.out.println(fact(n));
    
}
}
