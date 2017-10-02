import java.util.Scanner;

public class E831 {
    public static void main(String[] args) {


        String s = "123, 45,-34,231, 0,-1,-12312 , 12312,23423, -85, 89";

        s = s.replace( " ","");
        String [] numbers = s.split(",");
        for (int i = 0; i<numbers.length; i++){
            if (numbers[i].startsWith("-")){
                numbers[i] = "0";
            }
        }
        String result = String.join(",",numbers);
        System.out.println(result);

      /*
       Första två delarna
       if (s.startsWith("+46") || s.contains(".")){
            s = s.replace("+46", "");
            s = s.replace(".", "");

        } else {
            System.out.println("ok");
        }*/



        }
}
