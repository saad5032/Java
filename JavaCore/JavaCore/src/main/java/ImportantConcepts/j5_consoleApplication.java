package ImportantConcepts;
import java.util.Scanner;
public class j5_consoleApplication {
   public static String getInputFromConsole(int PresentYear){
        Scanner scan = new Scanner(System.in); 

        System.out.println("Hi1 what is your name ? ");
        String name = scan.nextLine(); 
        System.out.println("So your name is : "+name);

        boolean validInput = false;  // assign a boolean to use it in while condition
        int age=0; // make this variable outside so you can assign value to it inside do - block.
        System.out.println("When were you born  ?  ");
        do {
            System.out.println("Please enter the age >= "+ (PresentYear-125) + " and <= " + PresentYear);
            String DOB = scan.nextLine(); 
            try {
                age = checkDataAge(PresentYear, DOB);  // If invalid DOB is entered, age is -1 means age<0
                validInput = age < 0 ? false : true; // validinput becomes false if age < 0
            } catch (NumberFormatException badUserData) {
                System.out.println("Only numbers allowed, try again !!!");
            }
        }while(!validInput); // !false will be true, while(true) -> the do block loops again until user put valid DOB again

        return "So your age is : " + age; // In java if you concatenate string + int the int is automatically converted to string.
    }

    // This method will calculate and return your age and if you put invalid DOB it returns -1
    public static int checkDataAge(int PresentYear, String DOB){
        int dateOfBirth = Integer.parseInt(DOB);
        int age = PresentYear - dateOfBirth;
        int minYear = PresentYear - 125; // The oldest man can live is present year minus 125, i.e he can live 125 years
        // 2024 -125 = 1899, It does not make sense for DOB to be less than 1899 or to be greater than present year.
        if (dateOfBirth<minYear || dateOfBirth>PresentYear){  
            return -1;
        }
        return age;
    }

    public static void main(String[] args) {
        int PresentYear = 2024;
        System.out.println(getInputFromConsole(PresentYear));
    }
}
