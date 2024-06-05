package java_ch2_primitives;
public class primitives2 {

    // Wrapper classes and its use for whole number datatypes : int,long,byte,short
public static void main(String[] args) {

    // Ranges of primitive data types for whole numbers :
    System.out.println("byte Value Range (" + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE + ")");
    System.out.println("short Value Range (" + Short.MIN_VALUE + " to " + Short.MAX_VALUE + ")");
    System.out.println("int Value Range (" + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE + ")");
    System.out.println("long Value Range (" + Long.MIN_VALUE + " to " + Long.MAX_VALUE + ")");

    System.out.println("----------------------------------");

    // We can even see the size of memory each of this data type takes, for ex : int x = 100 , so computer takes 32 bit of memory 
    // to store value 100 in memory.
    System.out.println("byte occupies memory space : " + Byte.SIZE + " bits");
    System.out.println("short occupies memory space : " + Short.SIZE+ " bits");
    System.out.println("int occupies memory space : " + Integer.SIZE+ " bits");
    System.out.println("long occupies memory space : " + Long.SIZE + " bits");
}}

