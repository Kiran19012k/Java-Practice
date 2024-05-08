class KiruException extends Exception
{
    public KiruException(String str)
    {
        super(str);
    }
}
public class Exception1 {
    public static void main(String[] args) {
        int i=20;
        int j=0;
        int arr[]=new int[5];

        try
        {
        j=18/i;
        if(j==0)
            throw new KiruException("cannot be greater");
        }
        catch(KiruException e)
        {
            System.out.println("cannot divide by 0 "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array is limited "+e);
        }
        catch(Exception e){
            System.out.println("try again"+e);
        }

        System.out.println(j);
        System.out.println("end");

    }
    
}
