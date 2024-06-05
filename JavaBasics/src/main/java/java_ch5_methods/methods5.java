package java_ch5_methods;
// method overloading challenge :
/*
    Create two methods with the same name: convertToCentimeters
    1. The first method has one parameter of type int, which represents the entire height in inches. 
    You'll convert inches to centimeters, in this method, and pass back the number of centimeters, as a double.

    2. The second method has two parameters of type int, one to represent height in feet, and one to represent 
    the remaining height in inches. So if a person is 5 foot, 8 inches, the values 5 for feet and 8 for inches would
    be passed to this method. This method will convert feet and inches to just inches, then call the first method, 
    to get the number of centimeters, also returning the value as a double.

    Both methods should return a real number or decimal value for total height in centimeters.
    Call both methods, and print out the results.

    The conversion formula from inches to centimeters is 1 inch = 2.54 cm.
    Also, remember one foot/feet = 12 inches.
    
    You can use the link below to test your results: https://www.metric-conversions.org/length/feet-to-centimeters.htm

 */
public class methods5 {
    public static double convertToCentimeters(int heightInInches){
        double inchToCm = heightInInches * 2.54;  // converting inches to centimeters
        return inchToCm;
    }
    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches){
        int feetToInch = heightInFeet * 12;
        int totalHeightInInch = feetToInch + remainingHeightInInches;
        double Cm = convertToCentimeters(totalHeightInInch);
        return Cm;
    }
    public static void main(String[] args) {
        System.out.println("Conversion of inches to cm : "+ convertToCentimeters(156) + " Cm");
        System.out.println("Conversion of height from given feet-inch to cm : "+convertToCentimeters(5,8)+" cm");
    }
}
