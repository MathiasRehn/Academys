public class E8_4 {
    public static void main(String[] args) {

      /*  char[] a = {'J', 'a', 'v', 'a', 'R', 'u', 'l', 'e', 's'};
        StringBuilder sb = new StringBuilder();

        sb.append(a);

        String s = sb.toString();

        System.out.println(s);*/


      /*  String name ="Java Svensson";

        char[] nameArray = name.toCharArray();

        System.out.println(nameArray[2]);*/


        String input ="1,2,4,9,8,7,6,4,1";

        String[] numberArray = input.split(",");

        int[] num = new int[numberArray.length];

        for (int i = 0; i<=num.length-1; i++)
        {
        num[i] = Integer.parseInt(numberArray[i]);
        System.out.println(num[i]);
        }




    }
}
