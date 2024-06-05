package java_ch3_operators;
// All Relational operators returns boolean that is either true or false. So relational operators are often used with if/else, switch etc
public class operators2 {
    public static void main(String[] args) {
        int x = 15;
        int y = 25;

        // Greater than
        boolean isGreater = x > y;
        System.out.println("Is x > y? " + isGreater); // Output: false

        // Less than
        boolean isLess = x < y;
        System.out.println("Is x < y? " + isLess); // Output: true

        // Equal to
        boolean isEqual = x == y;
        System.out.println("Is x == y? " + isEqual); // Output: false

        // Not equal to
        boolean isNotEqual = x != y;
        System.out.println("Is x != y? " + isNotEqual); // Output: true

        // Greater than or equal to
        boolean isGreaterOrEqual = x >= y;
        System.out.println("Is x >= y? " + isGreaterOrEqual); // Output: false

        // Less than or equal to
        boolean isLessOrEqual = x <= y;
        System.out.println("Is x <= y? " + isLessOrEqual); // Output: true
    }

}
