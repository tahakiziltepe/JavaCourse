class a020_Human{

    int age; 
    String name;

    // Default Constructor. Even if you do not mention it, Java provides it with blank values to you. 
    public a020_Human(){ 
        age = 10; 
        name = "Michael";
    }

    // Parameterized Constructor
    public a020_Human(int age, String name){ 
        this.age = age;
        this.name = name;
    }

}

public class a020_Constructor {
    public static void main(String[] args) {
        a020_Human obj = new a020_Human();
        System.out.println(obj.age + " : " + obj.name);

        a020_Human obj1 = new a020_Human(19, "Joe");
        System.out.println(obj1.age + " : " + obj1.name);

        
        

    }
}
