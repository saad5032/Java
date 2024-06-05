package Oops3.Inheritance.j1_ParentChild;

public class Main3 {
    // method that takes j1_AnimalParent reference type as parameter :
    public static void doAnimalStuff(AnimalParent Animal, String speed){
        System.out.println("-------------------------------------");
        System.out.println("\nThe variables and their values/state of Child, combined with Parent variables : \n"+ Animal );  // Animal -> Can be child
        System.out.println("\nThe methods/Behaviors are : ");
        Animal.makeNoise();  
        Animal.move(speed);
        System.out.println("-------------------------------------");
    }
public static void main(String[] args) {
    FishChild FishObj = new FishChild("Dolphine", "small", 300, 5, 5);
    doAnimalStuff(FishObj, "fast");
}
}
