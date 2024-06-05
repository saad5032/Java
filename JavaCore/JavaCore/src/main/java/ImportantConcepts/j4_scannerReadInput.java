package ImportantConcepts;

import java.util.Scanner; // java.util package and Scanner is class in this package

public class j4_scannerReadInput {
  
    public static String getInputFromConsole(int PresentYear){
        // 2nd way to read input : use scanner class 

        Scanner scan = new Scanner(System.in); // scan is object name of the class Scanner which takes System.in as argument

        System.out.println("Hi1 what is your name ? ");
        String name = scan.nextLine(); // The next line method will read the user input from console.
        System.out.println("So your name is : "+name);

        System.out.println("When were you born  ?  ");
        String DOB = scan.nextLine();
        int age =  PresentYear - Integer.parseInt(DOB);
        return "So you are "+ age + " years old";
    }

    public static void main(String[] args) {
        int PresentYear = 2024;
        System.out.println(getInputFromConsole(PresentYear));
    }

    
}
