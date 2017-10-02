import java.util.Scanner;

public class Challenge6_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = in.next().charAt(0);

       switch (c){
           case 'a':
           case 'A':
           case 'e':
           case 'E':
           case 'i':
           case 'I':
           case 'o':
           case 'O':
           case 'u':
           case 'U':
           case 'y':
           case 'Y':
           case 'å':
           case 'Å':
           case 'ä':
           case 'Ä':
           case 'ö':
           case 'Ö':
               System.out.println(c + " är en Vokal");
               break;
           default:
               System.out.println(c + " är en Konsonant");
       }
    }
}
