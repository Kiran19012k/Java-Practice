abstract class car
{
    abstract public void drive();
   

    public void PlayMusic()
    {
        System.out.println("Playing Music");
    }
}

class Alto extends car {
     public void drive()
    {
        System.out.println("driving");
    }

}

public class Abstract1 {
    public static void main(String[] args) {

        car obj=new Alto();
        obj.drive();
        obj.PlayMusic();
        
    }
    
}
