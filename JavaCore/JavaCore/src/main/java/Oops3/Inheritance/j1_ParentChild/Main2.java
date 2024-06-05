package Oops3.Inheritance.j1_ParentChild;
public class Main2 {
    // Lets create a method that calls parent method that takes j1_AnimalParent reference type as parameter :
    public static void doAnimalStuff(AnimalParent Animal, String speed){  // static as method can be accessed by method name
        System.out.println("-------------------------------------");
        System.out.println("\n The variables and its values/state of Child are and also below Parent Attributes : \n"+Animal); 
        // The Animal calls the toString of child class.
        System.out.println("\nThe methods/Behavior of Object are : ");
        Animal.makeNoise();  // With Animal reference variable i can use parent attributes.
        Animal.move(speed);
        System.out.println("-------------------------------------");
    }
    public static void main(String[] args) {
        AnimalParent parentObj = new AnimalParent("Generic Animal", "Huge", 400);
        doAnimalStuff(parentObj, "slow");
        // The parent class object executes Move method and its old makeNoise method. Thus change is not reflected in parent class.
        /*
        - Performing constructor chaining from child to child to parent constructors.
        - child 3rd constructor inturn calls -> child 2nd constructor which inturn calls -> parent args constructor 
        - Thus just one child object created and on same line all inherited variables of parent and child variables 
          are initialzed and set to desired values inside this child object
        */
        DogChild childYorkieObj = new DogChild("Yorkie", 20); // According to weight the size is calculated.
        // The parent methods thus can be reused by child even in constructor chaining.

        // childYorkieObj is of type j1_DogChild Class which is of type j1_AnimalParent Class due to inheritance. 
        // Thus childYorkieObj is of type j1_AnimalParent and can be passed in below method doAnimalStuff().
        doAnimalStuff(childYorkieObj, "fast");
        // The child class object executes Move and makeNoise overridden/modified methods.

        DogChild childWolf = new DogChild("Wolf", 200);
        doAnimalStuff(childWolf, "slow");

    }
}
