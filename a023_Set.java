import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class a023_Set {
    public static void main(String[] args) {
        
        // Set collection which is used for UNIQUE values.
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(62);
        nums.add(74);
        nums.add(87);
        nums.add(91);

        Iterator<Integer> values = nums.iterator();
        
        while(values.hasNext()){
            System.out.println(values.next());
        }

        System.out.println("----");
        for(int n : nums){
            System.out.println(n);
        }

        // If you want to use sorted values you have to use TreeSet.
        Set<Integer> nums1 = new TreeSet<Integer>();
        nums.add(74);
        nums.add(87);
        nums.add(91);

        System.out.println("----");
        for(int n : nums1){
            System.out.println(n);
        }


    }
}
