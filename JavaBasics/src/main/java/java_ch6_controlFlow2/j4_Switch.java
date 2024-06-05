package java_ch6_controlFlow2;
public class j4_Switch {
// Lets make a method with switch, this method returns quater.
// if case is jan,feb,march then its quarter 1 ... and etc

// 1st way -> method using traditional switch
public static String quarter(String month){
    switch(month){
        case "JAN":
        case "FEB":
        case "MAR":
            return "1st quarter";
        case "APR":
        case "MAY":
        case "JUN":
            return "2nd quarter";
        case "JUL":
        case "AUG":
        case "SEP":
            return "3rd quarter";
        case "OCT":
        case "NOV":
        case "DEC":
            return "4th quarter";
    }
    return "bad input";
}

// 2nd way - method using advanced swith
public static String getQuarter(String month){
    /* comparing with 1st way
        1. Important to note is that below switch is an expression meaning
        switch is resolved in to single value and can be assigned to variable
        2.default is needed when switch is used as expression. This ensures 
        there's a return value even when none of the defined cases match.
        3. Use of Comma-Separated Cases */
    return switch (month){
        case "JAN","FEB","MAR" -> {yield "1st quarter";}
        case "APR","MAY","JUN" -> "2nd quarter";
        case "JUL","AUG","SEP" -> "3rd quarter";
        case "OCT","NOV","DEC" -> "4th quarter";
        default -> {
            String badResponse = month + " - bad input range";
            yield badResponse; // use yeild and not return as it throws error

            // we cannot use return keyword inside expression as return 
            // is designed to exit a method and return a value from that 
            // method to its caller. 

            // It does not work within a smaller scope, such as a expression
            // Therefore If you're writing a switch expression and you need to
            // return a specific value from a case or a code block within 
            // the switch, you must use yield.
        }
    };  // you need semicolon here an entire switch is expression and 
        // with return the complete thing is only one statement
}
public static void main(String[] args) {
    String month = "FEb";
    System.out.println(month + " is in the "+quarter(month));
    System.out.println(month + " is in the "+getQuarter(month));
}}
