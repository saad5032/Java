package java_ch6_controlFlow2;

public class j2_Switch {
    // Traditional way - Be careful if you dont use break then rest of the cases will be executed.
    public static void main(String[] args) {
        int value = 3;
        switch (value) {
            case 1:
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            // Here we are testing multiple cases at once, if
            // any of the case is true the below messages get printed.
            case 3: case 4: case 5:
                System.out.println("value is 3 or 4 or 5");
                System.out.println("Wait the value is actually " + value);
                break;
            default:
                System.out.println("value is nether 1,2,3,4 nor 5");
                break;
        }
    }
}
