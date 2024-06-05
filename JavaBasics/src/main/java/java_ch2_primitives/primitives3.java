package java_ch2_primitives;

public class primitives3 {
    // long : datatype
    public static void main(String[] args) {


        // To make it long at first iteself and not int we need to have suffix l or L (more readable and preffered) for long data type.
        long x = 100l;
        long y = 100L; 
        // if you dont suffix l literal will be treated as int by default first and then converted to long
        long z = 100;
        // So if literal exceed integer max value, you get error, because there is no suffix and literal will be treated as int first. 
        // long a = 2147483648; // throws error int max value is 2147483647
        // To solve it, you have forcely convert it to long by providing suffix l or L
        // System.out.println(a);
        long b = 2147483648L; // error gone.
    }
}
