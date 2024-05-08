import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1st array size");

        int s1=sc.nextInt();

        System.out.println("enter 2nd array size");
        int s2=sc.nextInt();
        
        int arr1[]=new int[s1];
        int arr2[]=new int[s2];

        if(arr1.length==arr2.length)
        {

        System.out.println("enter first arr ele");

        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }

        System.out.println("enter 2nd array ele");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }

        System.out.println("1st arrr elements");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);

        }

        System.out.println("2nd array elements");
        for(int n : arr2)
        {
            System.out.println(n);
        }

        System.out.println("addition of 2arrays");
        for(int i=0;i<arr1.length;i++)
        {
        System.out.println(arr1[i]+arr2[i]);
        }
    }
    else {
        System.out.println("enter same size");
    }

    }
    
}
