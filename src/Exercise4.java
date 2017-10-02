import java.math.BigDecimal;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) throws InterruptedException {

        Random rand = new Random();
        int maxValue = 10;

        SimpleCache cache = new SimpleCache();

        for (int i = 0; i < 10; i++) {
            int value = rand.nextInt(maxValue);
            System.out.println("Getting result for value " + value);
            int resultat = cache.calculate(value);
            System.out.println("Result: " + resultat);
            System.out.println();}
    }
}


