public class E6_6 {
    public static void main(String[] args) {
        char input = 'b';
        switch (input) {
            case 'a':
                handleA();
                break;
            case 'b':
                handleB();
                break;
            case 'c':
                handleC();
                break;
        }
    }

    private static void handleA() {
        System.out.println("You pressed 'a'");
    }

    private static void handleC() {
        System.out.println("You pressed 'c'");
        System.out.println("The sum of the 10 first numbers are ");
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }

    private static void handleB() {
        System.out.println("You pressed 'b' and here's 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
