package java_ch3_operators;

public class operators5 {
    public static void main(String[] args) {

        int a1 = 5;
        // Post-increment: Increment after assigning to 'b'
        int b1 = a1++; // 'b' gets 5, 'a' becomes 6
        System.out.println("Value of a after a++: " + a1); // Output: 6
        System.out.println("Value of b when a++ was used: " + b1); // Output: 5

        int a2 = 5;
        // Pre-increment: Increment before assigning to 'b'
        int b2 = ++a2; // 'b' gets 6, 'a' is also 6
        System.out.println("Value of a after ++a: " + a2); // Output: 6
        System.out.println("Value of b when ++a was used: " + b2); // Output: 6

        int a3 = 5;
        // Post-decrement: Decrement after assigning to 'b'
        int b3 = a3--; // 'b' gets 5, 'a' becomes 4
        System.out.println("Value of a after a--: " + a3); // Output: 4
        System.out.println("Value of b when a-- was used: " + b3); // Output: 5

        int a4 = 5;

        // Pre-decrement: Decrement before assigning to 'b'
        int b4 = --a4; // 'b' gets 4, 'a' is also 4
        System.out.println("Value of a after --a: " + a4); // Output: 4
        System.out.println("Value of b when --a was used: " + b4); // Output: 4


    }

}
