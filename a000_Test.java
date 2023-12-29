import java.util.ArrayList;
import java.util.List;

public class a000_Test {
    public static void main(String[] args) {
        String str = "4?5?4?aamm9";
        
        char[] cArr = new char[str.length()];
        cArr = str.toCharArray();
        List<Character> lst = new ArrayList<>();
        for(int i = 0 ; i < cArr.length ; i++){
          if(Character.isLetter(cArr[i])) {}
          else {lst.add(cArr[i]);}
          //if(Character.isDigit[cArr[i]]) { if((int)cArr[i] + (int)cArr[i+])  }
        }


        for(int i = 0 ; i < lst.size() - 3 ; i++){
          if(Character.isDigit(lst.get(i))) { 
            System.out.println(lst.get(i));
            System.out.println(lst.get(i+4));
            System.out.println(lst.get(i+1));
            System.out.println(lst.get(i+2));
            System.out.println(lst.get(i+3));
            if(Character.getNumericValue(lst.get(i)) + Character.getNumericValue(lst.get(i+4)) == 10 && lst.get(i+1) == '?' && lst.get(i+2) == '?' && lst.get(i+3) == '?' ) {System.out.println("true");}  
          }
        }

      
        // code goes here  
        System.out.println("false");
        


    }
}
