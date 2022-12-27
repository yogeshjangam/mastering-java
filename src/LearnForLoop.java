public class LearnForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        for (double rate = 2.0; rate <= 9.0; rate += 0.25) {
            if (rate == 7.5) {
                break;
            }
            System.out.println("100 at " + rate + "% interest rate is " + calculateInterest(100, rate));
        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
