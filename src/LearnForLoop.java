public class LearnForLoop {
    public static void main(String[] args) {
        for (int counter = 1; counter <= 5; counter++) {
            System.out.println(counter);
        }
        System.out.println("10,000 at 2% interest rate is "+ calculateInterest(10000,2));
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount  * (interestRate/100));
    }
}
