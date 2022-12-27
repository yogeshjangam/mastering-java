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

    }
}
