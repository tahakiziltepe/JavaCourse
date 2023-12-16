
class a007_Calculator {

    int a;

    public int add(int n1, int n2) {

        int r = n1 + n2;
        return r;
    }

}

public class a007_ClassesObjects {
    public static void main(String[] args) {

        int num1 = 4, num2 = 5;

        a007_Calculator calc = new a007_Calculator();
        int result = calc.add(num1,num2);

        // int result = num1 + num2;
        System.out.println(result);

    }
}
