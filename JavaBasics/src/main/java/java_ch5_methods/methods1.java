package java_ch5_methods;

// methods help you to reuse code block.
public class methods1 {

    // This method dont take any data in and dont retrun anything so use void.
    public static void methodName() {
        System.out.println(
                "Return nothing as void uesd and no need to make object for this class to call this method as static used.");
    }

    public static void Calculate() {
        // we are passing no parameters and these below variables are unique to this method so for 
        // every method you cannot just create variables again and again.
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus); // 10000 + (8*200) = 11600
            System.out.println("Final score first block : " + finalScore);
        }
    }
    public static void main(String[] args) {
        methodName();
        Calculate();
    }
}
