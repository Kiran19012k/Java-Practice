import java.util.Scanner;
import java.math.*;

public class array {

    public static void main(String arg[])
    {

        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        int arr[][][]=new int[r][c][d];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<d;k++)
                {
                //arr[i][j][k]=(int)(Math.random()*10);
                arr[i][j][k]=sc.nextInt();
                }
            }
        }

       
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                for(int k=0;k<d;k++)
                {
                System.out.print(arr[i][j][k] + " ");
                }
            }
            System.out.println();

            
        }
        System.out.println(arr[0][1][0]);
       /*Scanner sc=new Scanner(System.in);

       System.out.println("enter size");
       int size=sc.nextInt();

       int arr[]=new int[size];

       System.out.println("enter array elements");
       for(int i=0;i<size;i++)
       {
         arr[i]=sc.nextInt();
       }


       
        //int arr[]={1,2,3,5,8,7};

       // int arr[] = new int[6];  

        /*for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }*/

        
    }
    
}
