

class a019_Human{

    // This variable is directly accesible only in the same class thanks to "private" keyword! For example, you can not use it in main directly.
    private int age = 11; 
    private String name = "Michael";

    // You can get values in main by these methods:
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    // If you want to set values to variables out of this class, you can use this way:
    public void setAge(int age){
        this.age = age; // "this" keyword provide us to use parameters that have same names with variables.
    }
    public void setName(String name){
        this.name = name;
    }

}

public class a019_Encapsulation {
    public static void main(String[] args) {
        
        a019_Human obj = new a019_Human();
        System.out.println(obj.getAge() + " : " + obj.getName());

        obj.setAge(20);
        obj.setName("Joe");
        System.out.println(obj.getAge() + " : " + obj.getName());

    }
}
