public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Yogesh");
        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And i am not scared of aliens");
        }

        int topScore = 91;

        if(topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        // using equal operator gives error ==> if (newValue = 50) {
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }
    }
}