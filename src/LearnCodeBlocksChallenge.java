public class LearnCodeBlocksChallenge {
    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int finalScore = score;

        if (gameOver) {
            finalScore += levelCompleted * bonus;
            System.out.println("Your final score is " + finalScore);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        // Scenario 2
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            System.out.println("Your final score now is " + finalScore);
        }

    }
}
