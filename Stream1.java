import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        
        List<Integer> nums=new ArrayList<Integer>();

        // Stream<Integer> s1=nums.stream();
        // Stream<Integer> s2=s1.filter(n -> n%2==0);
        // Stream<Integer> s3=s2.map(n -> n*2);


        nums.add(10);
        nums.add(27);
        nums.add(43);
        nums.add(36);
        nums.add(10);

        int result=nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0,(c,e) -> c+e);


        System.out.println(result);


        // s3.forEach(n -> System.out.println(n));
    }
    
}
