

public class DoWhileLoop {
    public static void main(String[] args) {
        
        int i = 5;
        
        // If you want to run this code at least once you should use Do - While.
        // If your i is less than 5, your code runs unless i is equal to 5 or more.
        // If your i is equal to or more than 5, your code runs once.
        do
        {
            System.out.println("Hello " + i);
            i++;
        }
        while(i<5);

    }
}
