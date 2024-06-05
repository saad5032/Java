package java_ch3_operators;
// All logical operators returns boolean that is either true or false. So relational operators are often used with if/else,loops,switch etc
public class operators3 {
    public static void main(String[] args) {
        boolean condition1 = true;
        boolean condition2 = false;

        // Logical AND - all condtions should be true for result to be true
        boolean andResult = condition1 && condition2;
        System.out.println("condition1 && condition2: " + andResult); // Output: false

        // Logical OR - any one condition should be true for result to be true
        boolean orResult = condition1 || condition2;
        System.out.println("condition1 || condition2: " + orResult); // Output: true

        // Logical NOT - apply NOT on true, it becomes false. Also vice versa.
        boolean notResult = !condition1;
        System.out.println("!condition1: " + notResult); // Output: false
    }
}
