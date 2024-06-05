package Oops1;
public class j1_Main {
    public static void main(String[] args) {
    // Object 1
    j1_getSet obj = new j1_getSet(); 
    // obj is pointing to the object storing all variables and its values and methods of class j1_oops
    // So you can access those variables and its values and method of class j1_oops via its object name using dot notation.
    obj.CarDescribe();  // we can access the method as it is public which in turn get to know the private variable values.

    // obj.make = "Tesla"  we cannot access the variables outside of j1_oops class as these variables are declared private.
    // so we use get and set methods
    System.out.println("Color of car : " + obj.getColor()); // white
    obj.setColor("black");
    System.out.println("Now the Color of car is : " + obj.getColor()); // we change colot stored by first object to black
    System.out.println(" ------ obj 1 ends ------ ");

    // Object 2
    // Lets make another object. This object will store different values for same class j1_oops variables due to encapuslation.
    j1_getSet obj2 = new j1_getSet();
    System.out.println("Color of car : " + obj2.getColor());  // it is white again
    // This means first and second object do not affect each other. Thus state and behaviour of each object is managed independently due to 
    // encapulation (making fields private, using get set to access them is encapuslation implementaion).
    System.out.println(" ------ obj 2 ends ------ ");
    
    // object 3
    j1_getSet obj3 = new j1_getSet();
    obj3.CarDescribe();
    obj3.setMake("Porsche");
    obj3.CarDescribe();
    obj3.setMake(null);
    obj3.CarDescribe();
    System.out.println(" ------ obj 3 ends ------ ");
    }
}
