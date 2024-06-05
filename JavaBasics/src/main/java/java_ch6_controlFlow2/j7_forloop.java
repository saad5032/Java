package java_ch6_controlFlow2;
public class j7_forloop {
    public static boolean isPrime(int number){
    // Logic : I want to return true if number is 2 and below 2 if there is any number i want to return false.

    // All numbers below 2 are not primes so this logic is for those numbers. And 2 is our first prime number.
        if(number<=2){  
    // if number is below 2, equality operator fails and returns false, also if number is 2 equality operator returns true as 2==2
            return(number == 2); 
        }
    /* 
        for(int divisor = 2; divisor<number;divisor++){
            if (number%divisor == 0){  // number when divided by divisor and leaves remainder 0 then return false
                return false;
            }
        } 
    */
        /*  more efficient way :
        Consider n=36, The factors are: 1, 2, 3, 4, 6, 9, 12, 18, 36. Notice that after 6, the factors are essentially 
        repeats of previous factors, just in a different order (due to the division)- Checking divisibility up to 36/2 = 18 
        is sufficient to find all factors.
        Consider n=37, a prime number. If you check divisibility for all numbers up to 37/2 you will find no factors. 
        Thus, you can conclude that 37 is prime.*/
        for (int divisor = 2; divisor<=number/2;divisor++){
            if(number%divisor == 0){
                return false;
            }
        }
    // loop ends and false is NOT returned meaning number is prime, so after for loop ends we return true.
        return true;
    }
    public static void main(String[] args) {
        System.out.println("0 is "+ (isPrime(0) ? "a prime" : "NOT a prime"));
        System.out.println("1 is "+ (isPrime(1) ? "a prime" : "NOT a prime"));
        System.out.println("2 is "+ (isPrime(2) ? "a prime" : "NOT a prime"));
        System.out.println("3 is "+ (isPrime(3) ? "a prime" : "NOT a prime"));
        System.out.println("4 is "+ (isPrime(4) ? "a prime" : "NOT a prime"));
        System.out.println("13 is "+ (isPrime(13) ? "a prime" : "NOT a prime"));
        System.out.println("17 is "+ (isPrime(17) ? "a prime" : "NOT a prime"));
    }}
