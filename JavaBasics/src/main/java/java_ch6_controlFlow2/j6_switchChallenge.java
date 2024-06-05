package java_ch6_controlFlow2;

public class j6_switchChallenge {
    // advanced Switch challenge:
    public static void printDayOfWeek(int day){
        String dayOfWeek = switch(day){
            // The arrow type -> is used to return something
            case 0 -> "Sunday";
            case 1 -> {yield "Monday";}  // This is also valid syntax
            case 2 -> {yield "Tuesday";}
            case 3 -> {yield "Wednesday";}
            case 4 -> {yield "Thursday";}
            case 5 -> {yield "Friday";}
            case 6 -> {yield "Saturday";}

            default -> "Invalid day";
        }; // This colon indicates the switch is an expression 
           // and evaluates to sing value assigned to variable dayOfWeek.

        System.out.println(day + " stands for "+ dayOfWeek);
    }
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2); 
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);   
    }
}
