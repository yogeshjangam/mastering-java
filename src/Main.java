public class Main {
    public static void main(String[] args) {
        double km = (100 * 1.609344);
        System.out.println("Kms is " + km);

        int highScore = 50;

        if (highScore > 25) {
            highScore += 1000; // add bonus points
        }

        int health = 100;

        if ((health < 25) && (highScore > 1000)) {
            highScore -= 100;
        }

        int myVariable = 50;
        myVariable++;
        myVariable--;

        System.out.println("This is a test"); //semicolon is required to complete a statement. else it is an expression;

        System.out.println("THis is " +
                " another line" +
                " added in parts.");

        int anotherVariable = 50;myVariable--;System.out.println("myVariable "+myVariable); // valid statements but not really readable
    }
}
