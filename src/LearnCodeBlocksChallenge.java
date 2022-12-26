public class LearnCodeBlocksChallenge {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;


        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The high score is " + highScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next high score is " +
                calculateScore(gameOver, score, levelCompleted, bonus));


        displayHighScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighScorePosition("Robert", calculateHighScorePosition(1000));
        displayHighScorePosition("Peears", calculateHighScorePosition(500));
        displayHighScorePosition("James", calculateHighScorePosition(100));
        displayHighScorePosition("Dumpy", calculateHighScorePosition(25));

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

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
/*        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;*/
        int finalScore = score;

        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
            //System.out.println("Your final score is " + finalScore);
        }

        return finalScore;

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");

    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}
