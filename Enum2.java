enum laptop
{
    macbook(5000),gaming(3000),thinkpad(2000);
    private int price;

    private laptop(int price) {
        this.price = price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }
    
}


public class Enum2 {
    public static void main(String[] args) {

        laptop []lap=laptop.values();

        for(laptop llp : lap)
        {
            System.out.println(llp+":"+llp.getPrice());
        }

        //System.out.println(lap + ":"+lap.getPrice());
        
    }
    
}
