import java.util.Scanner;
public class search {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();

        int arr[][]=new int[r][c];

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
            arr[i][j]=sc.nextInt();
            }
        
        }
        
        int x=sc.nextInt();

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                

                 if(arr[i][j]==x)
                  {
                
                     System.out.println("x found in index("+i+","+j+")");
                  }
                  
            }
             
           System.out.println(); 
        
        }
        
    }
    
}
