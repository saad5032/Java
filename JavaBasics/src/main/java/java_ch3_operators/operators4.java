package java_ch3_operators;
// Assignment operators
public class operators4 {
    public static void main(String[] args) {
        int a = 10;

        // Simple assignment
        a = 20;
        System.out.println("After assignment, a: " + a); // Output: 20

        // Add and assign
        a += 5;
        System.out.println("After a += 5, a: " + a); // Output: 25

        // Subtract and assign
        a -= 3;
        System.out.println("After a -= 3, a: " + a); // Output: 22

        // Multiply and assign
        a *= 2;
        System.out.println("After a *= 2, a: " + a); // Output: 44

        // Divide and assign
        a /= 11;
        System.out.println("After a /= 11, a: " + a); // Output: 4

        // Modulo and assign
        a %= 3;
        System.out.println("After a %= 3, a: " + a); // Output: 1
    }
}
