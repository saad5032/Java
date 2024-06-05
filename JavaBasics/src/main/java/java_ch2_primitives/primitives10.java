package java_ch2_primitives;

/*
-> Create three char variables to store the character for the question-mark symbol.
mySimpleChar should be assigned the literal question-mark character ?.
myUnicodeChar should be assigned the unicode value for the question-mark ?.
myDecimalChar should be assigned the decimal value for the question-mark ?.
-> Print all three variables in one statement, that starts with the label “My values are”.
Hint: Use the symbl.cc website
 */
public class primitives10 {
    public static void main(String[] args) {
    char mySimpleChar = '?';
    char myUnicodeChar = '\u003F';
    char myDecimalChar = 63;
    System.out.println(mySimpleChar+"\n"+myUnicodeChar+"\n"+myDecimalChar);
    }
}
