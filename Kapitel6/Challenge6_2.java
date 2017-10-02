import java.util.Scanner;

public class Challenge6_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv in en siffra 1-12");
        int i = in.nextInt();
        System.out.println(Challenge6_2.getMonthName(i));
    }

    static String getMonthName(int month) {
        switch (month) {
            case 1:
                return "Januari";
            case 2:
                return "Februari";
            case 3:
                return "Mars";
            case 4:
                return "April";
            case 5:
                return "Maj";
            case 6:
                return "Juni";
            case 7:
                return "Juli";
            case 8:
                return "Augusti";
            case 9:
                return "September";
            case 10:
                return "Augusti";
            case 11:
                return "Novemebr";
            case 12:
                return "December";
        }
        return "Du måste skriva in ett tal 1-12";
    }
}
