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

            for (int i = 0; i < 19; i++) {
                System.out.println(i + " is" + (isPrime(i) ? " " : " NOT ") + "a prime number");
            }

            //find first 3 primes in a range and exit
            int maxPrimeCount = 3;
            int primeCount = 1;

            for (int i = 4; i < 100; i++) {
                if (primeCount == maxPrimeCount) {
                    break;
                }
                if (isPrime(i)) {
                    System.out.println("Found prime #" + primeCount + " is " + i);
                    primeCount++;
                }
            }
        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int number) {
        if (number <= 2) return (number == 2);
        for (int d = 2; d <= number / 2; d++) {
            if (number % d == 0) {
                return false;
            }
        }
        return true;
    }
}