public class LearnCodeBlocksChallenge {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;


        calculateScore(gameOver, score, levelCompleted, bonus);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);

     /*   if (gameOver) {
            finalScore += levelCompleted * bonus;
            System.out.println("Your final score is " + finalScore);
        }*/

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//        int newFinalScore = score;
//
//
//        // Scenario 2
//        if (newGameOver) {
//            newFinalScore += newLevelCompleted * newBonus;
//            System.out.println("Your final score *new* is " + newFinalScore);
//        }
   }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
/*        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/
        int finalScore = score;

        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }

    }
}
