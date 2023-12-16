

public class IfElse {
    public static void main(String[] args) {

        if(false) // Since the statement is false, it won't print something.
            System.out.println("False");
        if(true) 
            System.out.println("True");


        int x = 28;
        if(x > 10 && x < 20)
            System.out.println("Hello");
        else
            System.out.println("Bye");


        int a = 8;
        int b = 7;
        
        if(a > b)
        {
            System.out.println(a);
            System.out.println("Hello!");
        }
        else if(a == b)
            System.out.println(a + '.' + b);
        else
        {
            System.out.println(b);
            System.out.println("Bye!");
        }


        int n = 5;
        int result = 0;
        if(n%2==0)      // If n is even we will see 10 but it is not even we will see 20.
            result = 10;
        else
            result = 20;

        System.out.println(result);

        // There is a different syntax to use conditions.

        result = n%2==0 ? 10 : 20; // It means if n is even result will be 10. However, if n is not even result will be 20. 
        
        System.out.println(result);



    }
}
