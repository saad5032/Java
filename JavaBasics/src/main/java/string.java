public class string {
public static void main(String[] args) {
    // String concatenation :
    String myString = "Hi";
    myString = myString + "! Good morning";
    System.out.println(myString);

    String s1 = "250";
    String s2 = s1 + "50";
    System.out.println(s2);   // The result will be 25050 and not 300 be careful.

    //Lets see concatenation with int and string:
    // int x = "10"; throw error as java.lang.String cannot be converted to int. So what ever type is double quotes is string.
    int x = 10;
    String y = "50";
    y = y + x;    // The result will be 5010 as string + int is still string, here int 10 is converted to Stirng "10" by java.
    System.out.println(y);

    //Same goes for double
    double d = 230.90d;
    String str = "34";
    str = str + d;
    System.out.println(str);  // 34230.90  
    // 230.90 is treated as text by java as we are adding double to string and assigning to type string.


    // Mixing unicde with strings:
    myString = "I wish, I had \u00241,00,000,000"; // \u0024 it represents $
    System.out.println(myString); 
}}
