package java_ch2_primitives;
/* challenge : 
Your challenge is to create four new variables:

A byte variable, set it to any valid byte number, it doesn't matter. 
A short variable, set it to any valid short number.
An int variable,  set it to any valid integer number.
Lastly, create a variable of type long. Make it equal to 50,000 plus 10 times the sum of the values of the first 3 variables
(your byte, your short and your int values).  In other words, use the variable names in your expression to calculate the sum. */
public class primitives6 {
    public static void main(String[] args) {
        byte b = 10; // 10 is int here 
        short s = (short) (20);  // 20 is by default int but converted to short using casting
        int i = 50;
        long l_total = 50000L + 10L * (b+s+i); // you need to have L if number is huge so by default it is considered as long and not int.
        short s_total = (short)(1000 + 10 * (b+s+i)); // you need to do casting as variable is involved when dealing with shorter datatypes
        System.out.println(l_total);
        System.out.println(s_total);}}