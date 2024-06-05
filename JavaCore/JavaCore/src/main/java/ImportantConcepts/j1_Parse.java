package ImportantConcepts;
public class j1_Parse {
// parsing string to integer using static method of Integer wrapper class

public static void main(String[] args) {
    int PresentYear = 2024;
    
    String DOB = "1990";
    int intDOB = Integer.parseInt(DOB);   // String "1990" is parsed/tranformed to integer 1990

    // Note : We are using class name Integer to call its method parseInt, in other words parseInt is static method in class Integer.

    // lets calculte the age now :
    int age = PresentYear - intDOB;
    System.out.println("Your age is : "+age);
}
}
