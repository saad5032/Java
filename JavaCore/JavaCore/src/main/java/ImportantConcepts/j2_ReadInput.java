package ImportantConcepts;

public class j2_ReadInput {

    // Using System.console, lets read data from console or command line and use static method parse of class Integer.

    // 1st way to read input : using System.console method
    public static String getInputFromConsole(int PresentYear){
        String name = System.console().readLine("Hi1 what is your name : ");
        System.out.println("So your name is : "+name);

        String DOB = System.console().readLine("When were you born :  ");
        int age =  PresentYear - Integer.parseInt(DOB);
        return "So you are "+ age + " years old";
    }

    public static void main(String[] args) {
        int PresentYear = 2024;
        System.out.println(getInputFromConsole(PresentYear));
    }
}
