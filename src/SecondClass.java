public class SecondClass {
    public static void main(String[] args) {
        System.out.println("Second Class");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        System.out.println("Using while loop");

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        System.out.println("Using do while loop");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        int n = 0;
        while ( n <50)
        {
            n+=5;
            if(n % 25 == 0 ) continue;
            System.out.print(n+"_");
        }
    }
}
