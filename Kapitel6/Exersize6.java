import java.util.Scanner;

public class Exersize6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Välj en siffra 1 - 4");
        int x = in.nextInt();

        switch (x){
            case 1:
                System.out.println("Black");
                break;
            case 2:
                System.out.println("White");
                break;
            case 3:
            System.out.println("Red");
            break;
            case 4:
                System.out.println("Grees");
                break;
            default:
                System.out.println("Color invalid");
        }

    }
}
