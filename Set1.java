import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {
    public static void main(String[] args) {
        

        Set<Integer> nums=new TreeSet<Integer>();

        nums.add(10);
        nums.add(20);
        nums.add(45);
        nums.add(89);
        nums.add(20);
        

        System.out.println(nums);
    }
    
}
