package java_ch6_controlFlow2;

public class j9_forloop {
    /*
Create a for loop using a range of numbers from 1 to 1000 inclusive.
Sum all the numbers that can be divided by both 3 and 5.
Print out the numbers that have met the above conditions.
Break out of the loop once you have found 5 numbers that met the conditions above.
After breaking out of the loop, print the sum of the numbers that met the conditions above.
Note: type all code in the main method.
    */

    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;
        for(int num=1 ; num<=1000 ; num++){
            if (num%3 == 0 && num%5 ==0){
                sum += num;
                counter++;
                System.out.println("Number : " + num);
            }

            if (counter ==5){
                break;
            }
        }
        System.out.println("Total sum : "+ sum);
    }

}
