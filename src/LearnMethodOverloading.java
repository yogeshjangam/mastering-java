public class LearnMethodOverloading {
    public static void main(String[] args) {

        System.out.println("New score is "+ calculateScore("Tim",500));
        System.out.println("New score is "+ calculateScore(75));

        System.out.println("5ft8in is "+ convertToCM(5,8) +" in cms");

        System.out.println("68in is "+ convertToCM(68) +" in cms");
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

    public static double convertToCM(int inches) {
        return inches * 2.54;
    }

    public static double convertToCM(int feet, int inches) {
        return convertToCM(feet * 12 + inches);

    }

/*    public static void calculateScore()
    {
        System.out.println("Not player name, no player scored");

    }*/
}
