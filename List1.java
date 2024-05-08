import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        
        List<Integer> nums=new ArrayList<Integer>();


        nums.add(10);
        nums.add(30);
        nums.add(20);
        nums.add(36);
        nums.add(10);

        System.out.println(nums.get(3));
        System.out.println(nums.indexOf(20));

        // System.out.println(nums);

        for(int n : nums)
            System.out.println(n);


    }
    
}
