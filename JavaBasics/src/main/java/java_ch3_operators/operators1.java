package java_ch3_operators;

public class operators1 {
    // Arithmetic operators : Work on all numeric primitive datatypes and char datatype
    public static void main(String[] args) {
        // Using arithmetic operators with various data types

        // Using byte data type
        byte byteA = 10;
        byte byteB = 20;
        int byteResult = byteA + byteB; // result is promoted to int
        System.out.println("byteA + byteB: " + byteResult); // Output: 30

        // Using int data type
        int intA = 30;
        int intB = 15;
        int intResult = intA - intB;
        System.out.println("intA - intB: " + intResult); // Output: 15

        // Using long data type
        long longA = 1000L;
        long longB = 200L;
        long longResult = longA * longB;
        System.out.println("longA * longB: " + longResult); // Output: 200000

        // Using float data type
        float floatA = 5.5f;
        float floatB = 2.2f;
        float floatResult = floatA / floatB;
        System.out.println("floatA / floatB: " + floatResult); // Output: 2.5

        // Using double data type
        double doubleA = 10.5d;
        double doubleB = 3.5d;
        double doubleResult = doubleA % doubleB;
        System.out.println("doubleA % doubleB: " + doubleResult); // Output: 3.5

        // Using char data type
        char charA = 'A';
        char charB = 2;
        char charResult = (char) (charA + charB); // Cast to char
        System.out.println("charA + charB: " + charResult); // Output: 'C'
    }
}
