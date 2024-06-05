package java_ch6_controlFlow2;

public class j1_Switch {
    public static void main(String[] args) {
    // Using switch to Replace Multiple if-else
    String fruit = "Apple";

    // Using if-else to check multiple conditions
    if (fruit.equals("Apple")) {
        System.out.println("It's an Apple");
    } else if (fruit.equals("Banana")) {
        System.out.println("It's a Banana");
    } else if (fruit.equals("Orange")) {
        System.out.println("It's an Orange");
    } else {
        System.out.println("Unknown fruit");
    }

    // Using switch to achieve the same logic in a more structured way
    switch (fruit) {
        case "Apple":   // same as if 
            System.out.println("It's an Apple");
            break;
        case "Banana":  // same as 1st else if
            System.out.println("It's a Banana");
            break;
        case "Orange":  // same as 2nd else if
            System.out.println("It's an Orange");
            break;
        default:        // same as else statement
            System.out.println("Unknown fruit");
            break;
    }

    
}}
