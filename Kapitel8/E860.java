import java.util.Random;

public class E860 {
    public static void main(String[] args) {
        Random rand = new Random(-229985452);
        for (int i = 0; i < 5; i++) {
            int r = 96 + rand.nextInt(27);
            char c = (char) r;
            System.out.print(c);
        }

        rand = new Random(-147909649);
        for (int i = 0; i < 5; i++) {
            int r = 96 + rand.nextInt(27);
            char c = (char) r;
            System.out.print(c);

        }
    }
}
