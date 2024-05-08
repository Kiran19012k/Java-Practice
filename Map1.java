import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        

        Map<String,Integer> students=new HashMap<>();

        students.put("kiru",99);
        students.put("raze",45);
        students.put("sage",86);
        students.put("yoru",75);

       System.out.println( students.get("yoru"));

       for(String str : students.keySet())
       {
       System.out.println(str +":"+students.get(str));
       }
        //System.out.println(students);


    }
    
}
