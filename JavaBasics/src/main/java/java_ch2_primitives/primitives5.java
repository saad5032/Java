package java_ch2_primitives;

public class primitives5 {
    // Implicit promotion and Casting 
    public static void main(String[] args) {

        // Implicit promotion : In Java, when arithmetic operations involve smaller data types like byte, short, or char, 
        // they are promoted to int. 

        byte b1 = (-128/2); // -128/2 result is by default type int, but compiler know it can fit in byte range as only literals involved.

        byte b = -128;
        // byte b2 = b/2;  // b/2 result is int, cannot assign it to type byte (type mismatch error)
       
        byte b3 = (byte) (b/2);  // error is gone as used casting

    }
}
