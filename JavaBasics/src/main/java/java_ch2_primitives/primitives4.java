package java_ch2_primitives;
// Rules for declaring variables :
public class primitives4{
    public static void main(String[] args) {
        
    // You can declare variables of different data types in same line if they are separated by colon ";"
    short s = Short.MIN_VALUE ; int i = Integer.MIN_VALUE;

    // You can declare variables of same datatype in same line, if datatype is declared once before any variables separated by comma ","
    byte b1 = Byte.MIN_VALUE , b2= Byte.MAX_VALUE;

    System.out.println(s);
    System.out.println(i);
    System.out.println(b1);
    System.out.println(b2);
    }}
