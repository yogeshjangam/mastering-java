public class LearnMethodOverloading {
    public static void main(String[] args) {

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(75));
        calculateScore();
        System.out.println("5ft8in is " + convertToCM(5, 8) + " in cms");
        System.out.println("68in is " + convertToCM(68) + " in cms");
        System.out.println(area(20.75));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(59, 45));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(59, -45));
        System.out.println(getDurationString(-65, -45));
    }

    public static int calculateScore(String name, int score) {
        System.out.println("Player " + name + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        return calculateScore("Unnamed", score);
    }

    public static void calculateScore() {
        System.out.println("Not player name, no player scored");
    }

    public static double convertToCM(int inches) {
        return inches * 2.54;
    }

    public static double convertToCM(int feet, int inches) {
        return convertToCM(feet * 12 + inches);

    }

    public static String getDurationString(int seconds) {
        String result = "";
        if (seconds < 0) {
            System.out.println("Invalid seconds value, must be a positive  number");
        } else {


            int minutes = seconds / 60;
            seconds = seconds % 60;
            int hour = minutes / 60;
            minutes = minutes % 60;
            result = String.format("%1$sh %2$sm %3$ss", hour, minutes, seconds);
        }
        return result;

    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || minutes > 60) {
            System.out.println("Minutes out of range (0 to 59)");
            return "";
        } else if (seconds < 0) {
            System.out.println("Invalid seconds value, must be a positive  number");
            return "";
        } else {
            return getDurationString(minutes * 60 + seconds);
        }
    }
    public static double area(double radius){
        double result =0.0d;
        if (radius <0) { result = -1.0d;}
        else {result = radius * radius * Math.PI;}

        return result;
    }

}
