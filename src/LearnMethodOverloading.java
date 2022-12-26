public class LearnMethodOverloading {
    public static void main(String[] args) {

        System.out.println("New score is "+ calculateScore("Tim",500));
        System.out.println("New score is "+ calculateScore(75));
    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Unnamed", score);
    }

    public static int calculateScore()
    {
        System.out.println("Not player name, no player scored");
        return 0;
    }

/*    public static void calculateScore()
    {
        System.out.println("Not player name, no player scored");

    }*/
}
