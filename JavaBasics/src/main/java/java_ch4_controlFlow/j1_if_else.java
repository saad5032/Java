package java_ch4_controlFlow;

public class j1_if_else {
    public static void main(String[] args) {
    
    boolean x = false;  // assignment operator '=' assigns value of expression to the variable to the left of '=' operator

    // if condition - true - if block gets executed  
    // if condition - false - else block gets executed 

    if(x==true);
        System.out.println("1"); 
        // This should not be printed as x is true but it will be printed as it dont come under if condition as you 
        // terminated the if statement with semicolon.

    
    // This is why Using curly bracekts to write a code-block (all statements inside a code block are eexcuted)
    // is always best appach with if-else logic
    if(x==false){ // Equality operator '==' test if two operands (x and false) are equal or not and returns boolean, true if equal
        System.out.println("Hi, I am inside if");
    } else { 
        System.out.println("I am in else");
    }
    }
}