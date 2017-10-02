public class Java85 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<table>\n");
        for (int i = 1; i<=10;i++){
            if (i%2==0){
                sb.append("  <tr bgcolor=\"#cccccc\">\n");
            } else sb.append("  <tr bgcolor=\"#ffffff\">\n");
           sb.append("    <td>Row" + i + "</td>\n");
           sb.append("    <td>xxxxx<td>\n");
           sb.append("  </tr>\n");
        }
        sb.append("</table>\n");

        System.out.println(sb);
    }
}
