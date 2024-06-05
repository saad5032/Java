package java_ch6_controlFlow2;
/* NATO phonetic alphabet
    A = Able, B = Baker, C = Charlie, D = Dog, E = Easy
    F = Fox, G = George, H = How, I = Item, J = Jig
    K = King, L = Love, M = Mike, N = Nan, O = Oboe
    P = Peter, Q = Queen, R = Roger, S = Sugar, T = Tare
    U = Uncle, V = Victor, W = William, X = X-ray, Y = Yoke, Z = Zebra

    To do this:
1. Create a new char variable.
2. Use the traditional switch statement (with a colon in case labels) that tests the value in the variable from Step 1. 
    Create cases for the characters,  A, B, C, D, and E.
*/
public class j5_switchChallenge {

    // Traditional sswitch challenge :
    public static void main(String[] args) {
        char var = 'X';
        switch(var){
            case 'A':
                System.out.println("A is Able");
                break;
            case 'B':
                System.out.println("B is Baker");
                break;
            case 'C':
                System.out.println("C is Charlie");
                break;
            case 'D':
                System.out.println("D is Dog");
                break;
            case 'E':
                System.out.println("E is Easy");
                break;
            default :
                System.out.println("Letter "+var +" was not found in the switch");

        }
    }
}
