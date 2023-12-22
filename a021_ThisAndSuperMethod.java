
class a021_a extends Object // Every class in Java extends Object class, even if you do not mention.
{
    public a021_a(){
        super();
        System.out.println("in A!");
    }
    public a021_a(int n){
        super();
        System.out.println("in A int!");
    }
}

class a021_b extends a021_a // This phrase makes a021_a super method!
{
    public a021_b(){
        super(); // Even if you do not mention, every constructor has this phrase in their first line! It makes super method run.
        System.out.println("in B!");
    }
    public a021_b(int n){
        super(2); // If you want to run parameterized constructor of super method, you must give value to parameter.
        System.out.println("in B int!");
    }
    public a021_b(int a,String b){
        this(); // Also you can use this() to make this constructor + default constructor run. It doesn't make "a021_b(int n)" run.
        System.out.println("in B int + string!");
    }
    
}

public class a021_ThisAndSuperMethod {
    public static void main(String[] args) {
        
        a021_b obj = new a021_b();
        System.out.println("----");
        a021_b obj2 = new a021_b(5);
        System.out.println("----");
        a021_b obj3 = new a021_b(5,"A");
        


    }
}
