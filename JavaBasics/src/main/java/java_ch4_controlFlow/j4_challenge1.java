package java_ch4_controlFlow;

public class j4_challenge1 {
    public static void main(String[] args) {
        // step 1 : create a double variable with value 20.00
        double x = 20.00d;

        // step 2 : create a second double variable with value 80.00
        double y = 80.00d;

        // step 3 : add both numbers and multiply by 100
        double result = (x + y) * 100.00d;
        System.out.println(result);

        // step 4 : use the remainder operator to know the remainder from the result of
        // operation in step 3 and 40.00 will be ?
        double remainder = result % 40.00d;
        System.out.println(remainder);

        // step 5 : create a boolean variable that assigns the value true if the
        // remainder in step 4 is 0.00, or false if its not zero
        boolean var = (remainder == 0.00) ? true : false;
        // step 6 : output hte boolena variable
        System.out.println(var);

    }

}