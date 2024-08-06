package java_ch1_variables;


public class variables1 {

    // variable declaration statement : we are declaring variable with datatype-int, name - x and assigning it to value - 10
    int x = 10;  // here 10 is int literal as literal is single value of int/string/char
    

    // If we are initializing a variable in declaration statement, what you type to the right of "=" sign is assigned as the value and is 
    // known as expression in java. Lets use some complex expressions in java.

    int y = (10+5) + (2*10);  // here (10+5) + (2*10) is expression (combination of literals/operators)

    public static void main(String[] args) {  // This main method is entry point to this java class/file and excute what is inside.
        // challenge : lets change datatype and value of existing variable x.
        variables1 obj = new variables1();
        obj.x = 20;
        System.out.println(obj.x);
        System.out.println(obj.y);
    }
}


