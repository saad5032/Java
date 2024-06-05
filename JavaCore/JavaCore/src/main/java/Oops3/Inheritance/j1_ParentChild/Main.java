package Oops3.Inheritance.j1_ParentChild;
public class Main {
    // This method takes Parent reference variable and String.
    // Make this method static, to call it directly with just method name inside below main method.
    public static void doAnimalStuff(AnimalParent Animal, String speed){
        System.out.println("The variables and its values/state of Object are : \n"+Animal);
        System.out.println("The methods/Behavior of Object are : ");
        Animal.makeNoise();  // With Animal reference variable i can use parent attributes.
        Animal.move(speed);
    }
    public static void main(String[] args) {
        // Parent object
        AnimalParent parentObj = new AnimalParent("Generic Animal", "Huge", 400);
        System.out.println("Parent object");
        doAnimalStuff(parentObj, "100 km/hr");

        // Child Object 1 : this childObj will print null values for variables. So using dot method I set the values.
        // j1_DogChild childObj = new j1_DogChild(); // child constructor j1_DogChild() calls super() which calls parent default constructor.
        // As all fields are set to default in child obj due to default constructor, so you have to initialize them in the below way again.
        // childObj.size = "Big";
        // childObj.type = "Shephard";
        // childObj.weight = 400;

        // Child Object 1 printed.
        // childObj is of type j1_DogChild Class which is of type j1_AnimalParent Class due to inheritance. 
        // Thus childObj is of type j1_AnimalParent and can be passed in below method doAnimalStuff().
        // System.out.println("\nChild object");
        // doAnimalStuff(childObj, "200 km/hr ");

        // --> I am commenting the Child Object 1 as it will also call the parent args constructor as I commented super() and defined
        //     super(arg) in child class. The child obj values will be set to args (Bull,Huge600) defined in super(args), 
        //     Then again the child obj values will be reinistialized to (Shepard,Big,400) as I am using dot method

        // Child Object 2
        DogChild childObj2 = new DogChild(); // child constructor j1_DogChild() calls super(args) which calls parent args constructor.
        // The child object 2 printed.
        System.out.println("\nChild Object 2");
        doAnimalStuff(childObj2, "500km/hr");
    }
}