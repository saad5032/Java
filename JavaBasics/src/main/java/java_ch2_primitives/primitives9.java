package java_ch2_primitives;
// char and boolean primitive datatypes : 
public class primitives9 {
public static void main(String[] args) {
    // letter or character D
    char c1 = 'D'; // single character only in single quote and D is converted to U0044 and is stored in memory.
    // char c2 = 'DD'; error as only single caharcted is supported by char.
    char c2 = '\u0044'; // 2nd way and --> U0044 is directly stored in memory.
    char c3 = 68; //third way numeric assignment, inplace of 68, --> U0044 is stored in memory.
    // As all stores same unicode value U0044 when accessed gives same display letter D.

    System.out.println(c1+"\n"+c2+"\n"+c3);

}

}
