
class a009_Calculator
{
    public int add(int n1, int n2, int n3)
    {
        return n1 + n2 + n3;
    }
    public int add(int n1, int n2)
    {
        return n1 + n2;
    }
    public double add(Double n1, Double n2)
    {
        return n1 + n2;
    }
}

public class a009_MethodOverloading {
    public static void main(String[] args) {
        
        a009_Calculator obj = new a009_Calculator();
        int r1 = obj.add(3, 4, 5);
        System.out.println(r1);
    }
}
