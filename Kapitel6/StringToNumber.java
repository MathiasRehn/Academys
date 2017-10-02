import java.util.Scanner;

public class StringToNumber {
    public static void main(String[] args) {

        //Scanner in =  new Scanner(System.in);

       // String exempel2 = "asd 123 kjhj 154669 fhgf";
        // exempel2 = exempel2.replaceAll("\\D+","");

        /* Exempel med en string med bara nummer
        String exempel1 = "12346788";
        int i = Integer.parseInt(exempel1);
        */

        String s = "12375847";
        int b = 0;

        for (int x = 0; x < s.length(); x++){
            b = (b + (int)s.charAt(x) - 48)*10;
        }

        b = b/10;

        System.out.println(b);
    }
}
