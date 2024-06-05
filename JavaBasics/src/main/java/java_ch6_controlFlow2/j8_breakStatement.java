package java_ch6_controlFlow2;
/*
1. Create a prime number counter variable, that will keep count of how many prime numbers were found.
2. Create a for statement, using any range of numbers, where the maximum number is <= 1000.
3. For each number in the range:
    Check to see if it's a prime number using the isPrime method.
4. If the number is prime, print it out and increment the prime number counter variable.
5. Once the prime number counter equals three, exit the loop (Hint, use the break statement to exit).

 */
public class j8_breakStatement {
    // prime number check
    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        }
        for (int div = 2; div <= number / 2; div++) {
            if (number % div == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    int primeCounter = 0;
    // Exit the loop if you found first three primes
    for (int number = 10; number<=50;number++){
        if(isPrime(number)){
            System.out.println(number + " is a prime");
            primeCounter++;
        }
        if(primeCounter == 3){
            break;  // break/exit the for loop if counter is 3
        }
    }
    System.out.println("Total no of prime numbers : "+primeCounter);
}
}
