import java.util.Scanner;

public class E6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Välj en bokstav a - d");
        char x = in.next().charAt(0);


        switch (x){
            case 'a':
                System.out.println("Black");
                break;
            case 'b':
                System.out.println("White");
                break;
            case 'c':
                System.out.println("Red");
                break;
            case 'd':
                System.out.println("Grees");
                break;
            default:
                System.out.println("Color invalid");
        }
    }
}
