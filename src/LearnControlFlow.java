public class LearnControlFlow {
    public static void main(String[] args) {
        int value = 4;

/*        if (value == 1) {
            System.out.println("value was 1");
        } else if (value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("value was something other than 1 or 2");
        }*/

        switch (value) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> System.out.println("was a 3 or 4 or 5,\nActually was a " + value);
            default -> System.out.println("value was something other than 1, 2, 3, 4 or 5");
        }

        String month = "October";
        System.out.println(month + " is in " + getQuarter(month));

        System.out.println(getNATO('x'));

    }

    public static String getQuarter(String month) {


        return switch (month) {
            case "January", "February", "March" -> "Q1";
            case "April", "May", "June" -> "Q2";
            case "July", "August", "September" -> "Q3";
            case "October", "November", "December" -> "Q4";
            default -> {
                String result = "Invalid Month";
                yield result;
            }
        };
    }

    public static String getNATO(char input) {
        return switch (input) {
            case 'a', 'A' -> "Able";
            case 'b', 'B' -> "Baker";
            case 'c', 'C' -> "Charlie";
            case 'd', 'D' -> "Dog";
            case 'e', 'E' -> "Easy";
            default -> "Letter " + input + " was not found";
        };

    }
}
