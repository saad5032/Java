package Oops3.Inheritance.j1_ParentChild;
// Fish class inherits Animal class, so fish class can now access fields and methods of parent.
public class FishChild extends AnimalParent {
    // Fields if Fish child class : 
    private int gills;
    private int fins;

    // Constructor of Fish class
    // This fish class object made of this constructor will store parent variables (type,size,weight) and child variables (gills,fins) 

    public FishChild(String type, String size, double weight, int gills, int fins) {
        super(type, size, weight); // calls parent args constructor.
        this.gills = gills;
        this.fins = fins;
    }

    // Overriding parent methods as fish behaves differently than any normal Animal.
    // But first let me make some private methods which only this class owns and ill use them in over riding parents methods.

    private void moveMuscles(){
        System.out.println("Muscles are moving");
    }

    private void moveBackFin(){
        System.out.println("Back fin moving");
    }

    @Override
    public void move(String speed){
        super.move(speed);  // This will call move method of parent and executes what ever inside that method is.
        moveMuscles();
        if (speed == "fast"){
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish Child:  gills = " + gills + ", fins = " + fins + " " + super.toString();
        // super.toString prints toString of Parent class.
    }

    

    
    

    
    
    

}
