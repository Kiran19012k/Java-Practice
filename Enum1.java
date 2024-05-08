enum status
{
    Sucess,Failed,Pending,Running;
}

public class Enum1 {
    public static void main(String[] args) {

        status s=status.Running;

        switch (s) {

            case Sucess:System.out.println("done");
                break;
            case Failed:System.out.println("try again");
                break;
            case Pending:System.out.println("pls wait");
                break;
        
        
            default:System.out.println("all good");
                break;
        }


        // if(s==status.Sucess)
        //     System.out.println("done");
        // else if(s==status.Failed)
        //     System.out.println("try again");
        // else if(s==status.Pending)
        //     System.out.println("pls wait");
        // else
        //     System.out.println("all good");




        // for (status s : ss)  enhanced for loop
        // {
        //     System.out.println(s);
        // }

        
        
    }
    
}
