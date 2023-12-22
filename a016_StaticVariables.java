

class a016_Mobile {
    // Instance variables:
    String brand;
    int price;
    // Static variable: If every object should have same value for a variable, static variables is used.
    static String name;

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
}


public class a016_StaticVariables {
    public static void main(String[] args) {
        
        a016_Mobile obj1 = new a016_Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone"; // We should use a016_Mobile instead of obj1 due to name is a static variable.

        a016_Mobile obj2 = new a016_Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        obj2.name = "SmartPhone";
        
        obj1.show();
        obj2.show();

        System.out.println("----");

        a016_Mobile.name = "Phone"; // It will affect all the objects because name is a static variable!

        obj1.show();
        obj2.show();

    }
}
