import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) throws FileNotFoundException {
       /* Scanner in = new Scanner(System.in);
        System.out.println("Skriv in 3 tal");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        System.out.println("Tack, snart får du reslutatet");
        System.out.printf("%d %d %d", x, y, z);
*/

        String hello = "";
        Scanner sc = new Scanner(new File("C:\\Academy\\Vecka 1\\Dag2\\hello.txt"));

        while(sc.hasNext()){
        hello = hello + sc.next() + "\n";}
        sc.close();

        System.out.print(hello);
    }
}
