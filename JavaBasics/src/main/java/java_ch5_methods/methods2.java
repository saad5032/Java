package java_ch5_methods;

// methods with parameters and using static so no need to make object to call it
// Also method do not return anything as void is used.
public class methods2 {

    public static void Calculate(boolean gameOver,int score,int levelCompleted,int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus); // 10000 + (8*200) = 11600
            System.out.println("Final score first block : " + finalScore);
        }
    }
    public static void main(String[] args) {
        // You need to pass the parameters and also in correct order to call the method without error.
        int levelCompleted = 8;
        int bonus = 100;
        Calculate(true,10000,10,250); // In this call, I send the complete changed data.
        Calculate(false, 800,levelCompleted,bonus);  // You can pass default va;ues for levelcompleted and bonus 
    }
}
