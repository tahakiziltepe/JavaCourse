class a017_Mobile {
    // Instance variables:
    String brand;
    int price;
    // Static variable: If every object should have same value for a variable, static variables is used.
    static String name;

    // Instance method: You can use it with objects in main.
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    // Static method: You can use only static variables in static methods if you do not give parameter! (In this case, only "name"!)
    //                You can not use it with objects in main. You must use with class name! (In this case, "a017_mobile.show1()")
    public static void show1(){
        System.out.println(name);
    }

    // Static method: If you want to use instance variables in method, you have to give an object to method!
    public static void show2(a017_Mobile obj){
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}   


public class a017_StaticMethods {
    public static void main(String[] args) {
        a017_Mobile obj1 = new a017_Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone"; // We should use a017_Mobile instead of obj1 due to name is a static variable.

        a017_Mobile obj2 = new a017_Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1000;
        obj2.name = "SmartPhone";
        
        obj1.show();
        obj2.show();

        System.out.println("----");

        a017_Mobile.name = "Phone"; // It will affect all the objects because name is a static variable!

        obj1.show();
        obj2.show();

        System.out.println("----");

        a017_Mobile.show1();
        a017_Mobile.show2(obj2);;
        
    }
}
