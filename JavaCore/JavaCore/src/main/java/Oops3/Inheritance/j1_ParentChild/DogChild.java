package Oops3.Inheritance.j1_ParentChild;
// Child class
public class DogChild extends AnimalParent {
    private String earShape;
    private String tailShape;

    // Child Constructors : 
    public DogChild() {  // child default 1st constructor
        // You can call only one parent constructor either default or constructor with arguments
        // super(); // this inturn calls parent default constructor
        super("Bull dog", "Huge", 600); // inturn calls parent constructor with arguments
    }

    // Constructor Chaining :
    // With this child constructor, I am able to set all parent and child fields/variables, at object creation of child, inside child object 
    // in just one line.
    public DogChild(String type, double weight, String earShape, String tailShape) {  // child args 2nd constructor
        /*  This inturn calls parent args constructor so initialiation of type,size and weight is done.
            The nested ternary operation : weight<15 ? "Small" : (weight<35 ? "medium" : "Huge")  
             --> returns one string which is passed to size argument of parent constructor.
            This way you can perform operation in super iteself, as per rule super needs to be first statement.
        */
        // Thus parentConstructor(String type, String size, int weight) matched with below super(type, operation return String size,weight)
        super(type, weight<15 ? "Small" : (weight<35 ? "medium" : "Huge"), weight );   // calls parent constructor with arguments
        this.earShape = earShape;   // child fields earShape and tailShape initialization is done here.
        this.tailShape = tailShape;
    }

    public DogChild(String type, double weight){  
        // child 3rd constructor inturn calls above child 2nd constructor using this() syntax 
        this(type,weight,"Perky","viral");

    }

    // ------------------------------------------------

    // Child Methods 
    // Method Overriding : 
    // Methods of parent are over ridden, meaning these methods of parent will behave 
    // the way it is processed here for child class objects
    @Override
    public void makeNoise(){
    /* 
    - In Java, when a method in a child class has the same signature as a method in the parent class, then the child class's method overrides the parent class's method
    - We changed the makeNoise method of parent by calling child specic private method bark.This change is reflected only on all child objects and not the parent objects.
    */
    if (type == "Wolf"){   
        // The variable type in parent class is changed to
        // protected, thus type is used directly here in child.
        System.out.println("Ow Wooff !!");
    }
    bark();
    }
    
    @Override
    public void move(String speed) {
        super.move(speed); // This line basically calls move method of parent class. Till this line this method behave same as move method of parent.
        // We can modify the code more and child objects can behave in this modified version.
        // System.out.println(" And Dogs not only move but walk, run and wag their tail.");
        if(speed == "slow"){
            walk();
            wagTail();
        }else if (speed == "fast"){
            run();
            wagTail();}}
    // Now I am gonna make some private methods and call them from public methods move and makeNoise. A best way to hide internal logic.
    // The logic of below methods is only applicable to this class itself.
    private void bark(){
        System.out.println("Woof !!! ");
    }
    private void run(){
        System.out.println("Dog Running");
    }
    private void walk(){System.out.println("Dog is walking");}
    private void wagTail(){System.out.println("Dog is waving tail");}

    // ------------------------------------------------
    // toString()
    @Override
    // This toString of child combines with toString of parent toString via super.toString()
    // Thus the super.toString() will inturn call its parent toString() method.
    // Therefore when you print child object, both the toStrings of parent and child are concatenated and printed.
     public String toString() {
        return "\n Child Class + Parent : \n\n -> child variables : \n earShape = " + 
        earShape + ", tailShape = " + tailShape + ", \n\n -> parent variables via toString() of parent : \n " + super.toString()+"\n";
                
    }
}   
