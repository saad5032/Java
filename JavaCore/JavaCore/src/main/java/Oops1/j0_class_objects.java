package Oops1;
// Things you will learn in Oops1 - j0
// class (it can be real world object - home) and how objects use the class to create same home.
// this keyword.
public class j0_class_objects {
    // Variables
    private int x = 10; // Instance variable
    private static int y = 20; // static variable 
/*
    this keyword helps all objects distinguish between local and non local variables and to reassign values for their 
    non local variables and thus this keywords works on object level, where value of non local variables needs to be different 
    for all the variables. Therefore you cannot use this keyword with static methods.
    
    The below method throws error.
    public static void setV(int z) {  
        this.x = z;
        this.y = z;
    }
*/
// Methods
    public void setX(int x) {
        // You can use this keyword to set instance and static variable of class but only inside instance method.
        // this keyword helps to distinguish between local and non local variables for all objects.
        this.x = x; 
        System.out.println("instance "+this.x);
        this.y = x;
        System.out.println("static "+this.y);
    }

    // Main method in which we make objects of the class (j0_this).
    // You can make a separate java class and define only main method which can use the class (j0_this)
    public static void main(String[] args) {
        j0_class_objects obj1 = new j0_class_objects();
        // Using obj1 we are changing the static and instance variable value to 25
        obj1.setX(25);

        j0_class_objects obj2 = new j0_class_objects();
        // The static variable value of obj 2 is same as obj 1. This means value for static variable is shared among all objects.
        // The instance variable value of obj 2 is not same as obj1
        System.out.println("instance value of obj2 "+obj2.x);
        System.out.println("static value of obj 2 "+obj2.y);
    }
}



   