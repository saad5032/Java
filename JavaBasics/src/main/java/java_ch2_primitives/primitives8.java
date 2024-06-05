package java_ch2_primitives;

/*
 Challenge :
 The objective of this challenge, is to convert a given number of pounds to kilograms.
STEPS:
-> Create a variable with the appropriate type, to store the number of pounds that we want to convert into kilograms.
-> Calculate kilograms, using the variable above, and store the result in a 2nd appropriately typed variable.
-> Print the result.

Don't forget to use the conversion formula shown here:
1 pound is equal to 0.45359237 of a kilogram
*/

public class primitives8 {
    public static void main(String[] args) {
        double no_of_pounds = 200d;  // provide suffix d even if not needed in case od double data type for more readability.
        double kg = 0.45359237d * no_of_pounds; // use suffix d for 0.45359237 as its good practise even if java assumes it as double.
        System.out.println(kg);

    }

}
