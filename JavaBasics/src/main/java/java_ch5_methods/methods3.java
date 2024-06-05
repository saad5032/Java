package java_ch5_methods;

public class methods3 {
    // methods that returns data.
    
    // method data type is int, so it should return int.
    public static int Calculate(boolean gameOver,int score,int levelCompleted,int bonus) { // method datatype is int
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus); 
        }
        return finalScore; // so it should return int
    }

    public static void main(String[] args) {
        int var = Calculate(true, 100, 200, 8); // as method returns int you need to store in int var
        System.out.println(var);
    }
}
