import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  
public class a000_Test {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,3,4,5);
        
        Stack<Integer> stack = new Stack<>();

        stack.push(1);

        System.out.println(stack.isEmpty());

        String num1 = "1+1i";
        char[] arr1 = num1.toCharArray();

        char[] one = {'b','a','n'};
        char[] two = {'l','o'};
        Map<Character,Integer> count = new HashMap<>();
        for(int i = 0 ; i < one.length ; i++){
                count.put(one[i],0);
        }
        for(int i = 0 ; i < two.length ; i++){
                count.put(two[i],0);
        }
        for(char n : text.toCharArray()){
            if(count.containsKey(n) && one.contains(n)){
                count.put(n,count.get(n)+1);
            }
            else if (count.containsKey(n) && two.contains(n)){
                count.put(n,count.get(n)+1);
            }
        }
        int x = Integer.MAX_VALUE;
        for(int n : count.values()){
            if(n < x) { x = n; }
        }
        System.out.println(x);
        

    return x;


       
    }
}
