class a018_Mobile {
    String brand;
    int price;
    static String name;

    // Constructor. Default values for instance variables:
    public a018_Mobile(){
        brand = "";
        price = 200;
    }

    // Default values for static variables: (Every time static is worked firstly, even if you place it last.)
    static{
        name = "Phone";
    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

}

public class a018_StaticBlocks {
    public static void main(String[] args) throws ClassNotFoundException {

        // If you want to load class but not to create any object, you can use the following method:
        Class.forName("a018_Mobile"); 
   
        // In this way, you can use static variables:
        System.out.println(a018_Mobile.name);
    
    }
}
