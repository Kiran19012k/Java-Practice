@FunctionalInterface

interface A {
    int show(int i,int j);

}

public class Lambda {
    public static void main(String[] args) {
        A obj=new A() {

            public int show(int i,int j)
            {
                return i+j;
            }
            // A obj=( i, j)->     USING LAMBDA EXPRESSION
            // {
            //     return i+j;
            // };
        };
        
        System.out.println(obj.show(5,6));
        

    }
    
}
