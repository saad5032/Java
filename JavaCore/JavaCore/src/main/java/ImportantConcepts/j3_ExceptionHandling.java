package ImportantConcepts;

public class j3_ExceptionHandling {

    // Exception hadling done using try/catch statements

    public static String getInputFromConsole(int PresentYear){
        String name = System.console().readLine("Hi1 what is your name : ");
        System.out.println("So your name is : "+name);

        String DOB = System.console().readLine("When were you born :  ");
        int age =  PresentYear - Integer.parseInt(DOB);
        return "So you are "+ age + " years old";
    }
    public static void main(String[] args) {
        int PresentYear = 2024;
        try{
            // if try block has some error, catch block will be executed
            System.out.println(getInputFromConsole(PresentYear));  
        } catch (NumberFormatException e) {
            System.out.println("The code has error :" + e); // using e you can print the message
        }
    }
}
