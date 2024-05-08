public class Wrapper {
    public static void main(String[] args) {
        int num1=7;

        Integer num2=num1;          //auto boxing
        //Integer num2=new Integer(num1);  ---boxing

        int num3=num2;             //auto unboxing
        //int num3=num2.intValue();    ----unboxing

        System.out.println(num3);


        String str="12";
        int num4=Integer.parseInt(str);

        System.out.println(num4*2);

    }
    
}
