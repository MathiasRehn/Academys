public class E820 {
    public static void main(String[] args) {
        char[] ascii = {'A', 'B', 'C', 'D', 'E', 'F'};
        int counter = 21;

        for (int c = 33; c < 127; c++) {
            if (counter % 10 == 0) {
                for (int i = 0; i < ascii.length; i++) {
                    System.out.println((char)c + " har hex: " + ((counter - 1) / 10) + ascii[i] + " ");
                    if (++c == 127) return;
                }
            }
            System.out.println((char)c + " har hex: " + counter + " ");
            counter++;
        }
    }
}

