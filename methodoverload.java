import java.util.*;
import java.util.Scanner;
class Calculator
{
    int add(int a,int b,int c)
    {
        return a+b+c;
    }

    int add(int a,int b)
    {
        return a+b;
    }
}
    

class Methodoverload
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a");
        int a=sc.nextInt();

        System.out.println("enter b");
        int b=sc.nextInt();

        System.out.println("enter c");
        int c=sc.nextInt();

        Calculator cal=new Calculator();


        System.out.println("addition of 3numbers:"+a+"+"+b+"="+cal.add(a,b,c));
        System.out.println("addition of 2numbers:"+cal.add(a,b));

        


    
        
        

        
    }
}