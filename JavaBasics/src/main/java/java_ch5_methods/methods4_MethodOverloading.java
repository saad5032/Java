package java_ch5_methods;
// Successful method overloading, as Java is able to recognize each method uniquely as each method has unique method signature
// When i say unique method signature meaning, the parameters number,datatypes and order are different for each method.
public class methods4_MethodOverloading {

        // Method that adds two integers
        public static int add(int a, int b) {
            return a + b;
        }
    
        // Method that adds three integers
        public static int add(int a, int b, int c) {
            return a + b + c;
        }
    
        // Method that adds two doubles
        public static double add(double a, double b) {
            return a + b;
        }
    
        // Method that adds an integer and a double
        public static double add(int a, double b) {
            return a + b;
        }
        
        // Method that adds a double and an integer
        public static double add(double a, int b) {
            return a + b;
        }

        public static void main(String[] args) {
            System.out.println(add(5,6));
            System.out.println(add(5.88, 09.67477));
        }

}
