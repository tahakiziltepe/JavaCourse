import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class a022_ArrayLists {
    public static void main(String[] args) {
        
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        

        boolean a = nums.contains(6);
        System.out.println(a);

        for(int n : nums){
            System.out.println(n);
        }
        
        // If you want to work with index values, you should use List instead of Collection:

        List<Integer> lst = new ArrayList<Integer>();
        lst.add(3);
        lst.add(4);
        lst.add(7);
        lst.add(1);

        System.out.println(lst.get(0));
        lst.remove(3);
        
        System.out.println(lst);
        lst.set(1, 11);
        System.out.println(lst);
        lst.add(1, 5);
        System.out.println(lst);

        for(int n : lst){
            System.out.println(lst.indexOf(n));
        }
        System.out.println("----");
        lst.forEach(n -> System.out.println(n));




    }
}
