package Oops3.Inheritance.j1_ParentChild;
// Things you will learn in Oops3 - Inheritance - j1
// Inheritance : Parent and child classes and their objects behavior.
// super() : Used by child class to call the parent constructor, so parameters of super should match with the constructor parameter it wants to call.
// Parent Class
public class AnimalParent {
    // Fields
    protected String type;
    private String size;
    private double weight;

    // parent args constructor : 
    // This constructor with arguments helps you to initialize these fields by you explicitly for every object at object creation.
    public AnimalParent(String type, String size, double weight) {
        this.type = type; this.size = size; this.weight = weight;
    }
    // Parent default constructor.
    // The default constructor Must be explicitly provided by you since a constructor with arguments was defined above.
    // as java wont provide this default constructor implicitly(automatically)
    public AnimalParent(){
        // The defualt constructor helps you to initialize all fields (primitives/non primitives) to the default values.
    }
    // ------------------------------------------------
    // Parent Methods : 
    public void move(String speed){
        System.out.println("Move method : "+type + " moves "+ speed);

    }
    public void makeNoise(){
        System.out.println("makeNoise method : "+type + " makes some kind of noise");
    }

    // ------------------------------------------------
    // toString - to print the variables/fields of every current object in formatted string.
    // We have to override the toString as this method returns string with classname and object hashcode.
    @Override
    public String toString() {
        return "\n\nParent variables (inherited by child) : \ntype = " + type + ", size = " + size + ", weight = " + weight + "";
    }
}
