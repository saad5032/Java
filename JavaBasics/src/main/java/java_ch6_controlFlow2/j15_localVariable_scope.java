package java_ch6_controlFlow2;
/*  
local variable - A local variable is called local, because it is available for use by the code block in which it was declared.
(we can make code block using curly braces or it can be if-block, for loop- block, method block etc.)  
The scope of local variable is block-level meaning it is not accessed/used outside the code block in which it is defined. 
    
Therefore, local variables are accessible in memory for temporary period as long as the code block in which they are declared 
is being executed, meaning local variable life span is equal to the code block execution time.

Local variables are stored in stack memory that works with LIFO (Last In First Out) process. Once execution of for loop starts,
memory of int i – local variable, local to for loop block is created in stack and once for loop ends, the variable stack is taken out.
Thus, taking back the memory given to int i.

*/

public class j15_localVariable_scope {
    // 1. local variable scope in methods :
    public void exampleMethod() {
        int localVar = 5; // This variable is local to this method
        System.out.println("Local variable: " + localVar);
    }

    public void anotherMethod() {
        // This will not work, localVar is not accessible here
        // System.out.println(localVar); 
    }

    // 2. Local Variables in Loops - Best practise is to declare and initialize variables in the same place if possible and 
    //    to declare variables in the narrowest scope possible.

    public void loopExample() {
        for (int i = 0; i < 3; i++) {
            int loopVar = i * 2; // Scope is limited to this loop
            System.out.println("Loop variable: " + loopVar);
        }
        // This will not work, loopVar is not accessible outside the loop
        // System.out.println(loopVar);
    }

    // 3. Local Variables in if-else Statements
    public void ifElseExample(boolean condition) {
        if (condition) {
            int ifVar = 10; // Local to this 'if' block
            System.out.println("If variable: " + ifVar);
        } else {
            // This will not work, ifVar is not accessible here
            // System.out.println(ifVar);

            int elseVar = 20; // Local to this 'else' block
            System.out.println("Else variable: " + elseVar);
        }

        // Neither ifVar nor elseVar is accessible here
        // System.out.println(ifVar); 
        // System.out.println(elseVar); 
    }

    // 4. Local Variables in switch Statements
    public void switchExample(int value) {
        int y = 0; // Declared outside to extend scope across cases
    
        switch (value) {
            case 1:
                int x = 10;
                System.out.println("Case 1: " + x);
                break;
    
            case 2:
                y = 20; // Now accessible across subsequent cases
                System.out.println("Case 2: " + y);
                break;
    
            case 3:
                System.out.println("Case 3: " + y); // No error because y has extended scope
                break;
    
            default:
                break;
        }
    }

}
