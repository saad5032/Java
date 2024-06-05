package Oops1;
public class j1_getSet {
    // Things you will learn in Oops1 - j1
    // Class implementing Encapuslation concept (hiding its variable values)
    // private access modifier
    // getters and setters.

    // make is reference variable name pointing to 
    //String object which is storing state/value Toyota"
    private String make = "Toyota";  
    private String model =  "Innova";
    private String color = "white";

    // This is a non reference variable or primitive datatype which stores 4 
    private int doors = 4; 

    private boolean convertible;

    public void CarDescribe(){
        System.out.println(
            doors+ "-Door "+color+" "+make+" "+model+" "+ (convertible?"convertible":" ")
        );
    }

    // make getter and setters 
    public String getMake() {   // get method returns private variable value
        return make;
    }

    public void setMake(String make) { 
        // set method does not return anything as set method is used to only manipute value/state of
        // private variable and reassign the manipulated value to the variable.
        if (make == null) make = "Unknown";
        String makeLowerCase = make.toLowerCase();
        switch (makeLowerCase){
            case "holden","toyota","porsche" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

  
    
}
