public class LearnMethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Time", 500);
        calculateScore(75);
        System.out.println("New score is "+ newScore);
    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }
}
