public class Task9 {
    public static void main(String[] args) {
        String s = "java string programs";
        String[] a = s.split(" ");
        StringBuilder sb = new StringBuilder(a[0].toLowerCase());
        for (int i = 1; i < a.length; i++)
            sb.append(Character.toUpperCase(a[i].charAt(0)))
              .append(a[i].substring(1).toLowerCase());
        System.out.println(sb.toString());
    }
}
