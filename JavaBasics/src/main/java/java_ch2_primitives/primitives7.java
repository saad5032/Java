package java_ch2_primitives;

// float and decimal datatypes for decimal point numbers
public class primitives7 {
    public static void main(String[] args) {
// The double is the java default floating point number. It means any floating-point literal is considered as 
// double by java because double is more precise and larger than float datatype.

        int i = 5;
        float f1 = 5;  // int 5 to float 5.0 converted by java
        double d = 5;  // int 5 to double 5.0 converted by java

        float f2 = 5.0f; // double 5.0 to float 5.0 converted by using suffix f
        float f3 = (float) 5.0; // double 5.0 to float 5.0 converted by using casting.

        // double is more precise than float.
        float f4 = 5f/2f; // output : 2.5
        double d1 = 5d/2d; // output : 2.5

        float f5 = 5f/3f;  // output: 1.6666666
        double d2 = 5d/3d; // output : 1.6666666666666667

        // other ways to express double : Any floating number 5.00 is assumed as double by java.
        double d3 = 5.00/3.00; // output : 1.6666666666666667  
        double d4 = 5.00/3;  // output : 1.6666666666666667  // even there is one floating point double, the result is double.

        // float f3 = 5.00/3f  // error
        // Here when 5.00 is assumed as double by java and as result is double, we cannot assign it to float type. So, mismatch type error.


// Using Float and Double wrapper classes
        System.out.println("float range is : "+Float.MIN_VALUE + " to "+ Float.MAX_VALUE);
        System.out.println("double range is : "+Double.MIN_VALUE + " to "+ Double.MAX_VALUE);
    }}
