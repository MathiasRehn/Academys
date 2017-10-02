import java.util.Scanner;

public class E6_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your choice (1-4): ");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected 1.");
                break;
            case 2:
            case 3:
                System.out.println("You selected 2 or 3.");
                break;
            case 4:
                System.out.println("You selected 4.");
                break;
            default:
                System.out.println("Please enter a choice between 1-4.");
        }

    }
}
