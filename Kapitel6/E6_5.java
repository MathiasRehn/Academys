import java.util.Scanner;

public class E6_5 {
    public static void main(String[] args) {
        double summa = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Välj det första talet:");
        double a = in.nextDouble();
        System.out.println("Välj det andra talet:");
        double b = in.nextDouble();
        System.out.println("Väld din operatör(+ - * /):");
        char x = in.next().charAt(0);


        switch (x){
            case '+':
                System.out.println("Resultat: " + (summa =add(a,b)));
                break;
            case '-':
                System.out.println("Resultat: " + (a-b));
                break;
            case '*':
                System.out.println("Resultat: " + (a*b));
                break;
            case '/':
                System.out.println("Resultat: " + (a/b));
                break;
            default:
                System.out.println("Invalid operator");
        }

    }

    public static double add(double a, double b){
      return a + b;
    }

    public static double min(double a, double b){
        return a - b;
    }

    public static double mul(double a, double b){
        return a * b;
    }

    public static double div(double a, double b){
        return a / b;
    }
}
