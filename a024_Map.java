import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class a024_Map {
    public static void main(String[] args) {

        Map<String,Integer> student = new HashMap<>();
        student.put("Michael", 56);
        student.put("Joe", 13);
        student.put("Kevin", 90);

        System.out.println(student);

        System.out.println("Joe ===> " + student.get("Joe"));

        // In order to change value of a key, you can use put for same key.
        student.put("Joe", 1);

        System.out.println(student);

        // There is not index for Map. That is why if you want to use for loop, use keySet()
        for(String k : student.keySet()){
            System.out.println(k + " : " + student.get(k));
        }
        
        student.values()
    }
}
