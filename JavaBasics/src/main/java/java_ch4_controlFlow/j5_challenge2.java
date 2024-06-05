package java_ch4_controlFlow;

public class j5_challenge2 {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;


        if(gameOver){
            finalScore += (levelCompleted * bonus); // 10000 + (8*200) = 11600
            System.out.println("Final score first block : "+finalScore);
        }

        // What will happen if we redefine variables :
        levelCompleted = 5;
        bonus = 100;
        finalScore = 10000;
        if(gameOver){
            finalScore += (levelCompleted * bonus); // 10000 + (5*100) = 10500
            System.out.println("Final score second block : "+finalScore);
        }
        // Advantage : You save memory by not defining another new variable.
        // Disadvantage : The first block is following old values and second block is following new values.
        // So duplication, make you change the code in more than one place.

    }

}
