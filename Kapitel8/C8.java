import java.util.Scanner;

public class C8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String s = scanner.nextLine();

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if ((int)c >=65 && (int)c <= 90){
                System.out.print(c);
            } else{
                int g = (int)c-32;
                c =(char)g;
                System.out.print(c);
            }

        }

    }
}
