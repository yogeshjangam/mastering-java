public class SecondClass {
    public static void main(String[] args) {

        hasSharedDigit(12, 23);

//        System.out.println(isPalindrome(11));
//        System.out.println(getEvenDigitSum(123456789));
//        System.out.println("f+l for 252 ::" + sumFirstAndLastDigit(252));
//        System.out.println("f+l for 5 ::" + sumFirstAndLastDigit(5));
//        System.out.println("Second Class");
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Using while loop");
//
//        int j = 1;
//        while (j <= 5) {
//            System.out.println(j);
//            j++;
//        }
//
//        System.out.println("Using do while loop");
//        int k = 1;
//        do {
//            System.out.println(k);
//            k++;
//        } while (k <= 5);
//
//        int n = 0;
//        while (n < 50) {
//            n += 5;
//            if (n % 25 == 0) continue;
//            System.out.print(n + "_");
//        }
//
//        //Printing only even numbers
//        n = 0;
//        int countOfEven = 0;
//        int countOfOdd = 0;
//        while (n < 100) {
//            n++;
//            if (!isEven(n)) {
//                countOfOdd++;
//                continue;
//            }
//            System.out.println(n + " is an even number");
//            countOfEven++;
//            if (countOfEven >= 5) {
//                break;
//            }
//        }
//        System.out.println("Found " + countOfOdd + " odd numbers and " + countOfEven + " even numbers.");
//
//        System.out.println("Sum of digits 123 :" + sumDigits(123));
//        System.out.println("Sum of digits 1 :" + sumDigits(1));
//        System.out.println("Sum of digits 12 :" + sumDigits(12));
//        System.out.println("Sum of digits 145643 :" + sumDigits(14563));
//        System.out.println("Sum of digits 100 :" + sumDigits(100));
    }

    public static boolean isEven(int n) {
        return (n % 2 == 0);
    }

    public static int sumDigits(int number) {
        int result = 0;
        if (number < 0) {
            result = -1;
        }
        int n = number;
        int d = 0;

        do {
            d = n % 10;
            result += d;
            System.out.println("digit :" + d);
            n = n / 10;
        } while (n != 0);
        return result;
    }

    public static boolean isPalindrome(int n) {
        int result = 0;
        int originalNumber = n;
        int d = 0;
        do {
            d = n % 10;
            result = result * 10 + d;
            n = n / 10;
        } while (n != 0);


        return (result == originalNumber);
    }

    public static int sumFirstAndLastDigit(int n) {
        int result = 0;
        if (n < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = 0;

        int d = 0;
        int cd = 0;
        do {
            d = n % 10;
            cd++;


            result = result * 10 + d;
            n = n / 10;
            if (cd == 1) firstDigit = d;
            lastDigit = d;
        } while (n != 0);

        return (firstDigit + lastDigit);

    }

    public static int getEvenDigitSum(int n) {
        int result = 0;
        if (n < 0) {
            return -1;
        }

        int d = 0;

        do {
            d = n % 10;
            if (n % 2 == 0) {
                result = result + d;
            }

            n = n / 10;

        } while (n != 0);
        return result;
    }

    public static boolean hasSharedDigit(int a, int b) {
        boolean result = false;

        int a1 = a % 10;
        int a2 = (a / 10) % 10;
        int b1 = b % 10;
        int b2 = (b / 10) % 10;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(b1);
        System.out.println(b2);

        return (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2);
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        return ((a % 10) == (b % 10) && (b % 10) == (c % 10));
    }

    public static int printFactors(int n)
    {
        int result = 0;
        if (n < 1) {
            System.out.println("Invalid Value");
        }
        else
        {

        }
        return  result;
    }
}
