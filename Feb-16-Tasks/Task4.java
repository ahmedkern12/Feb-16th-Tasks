public class Task4 {
    public static void main(String[] args) {
        String s = "<h1>Hello</h1>";
        String result = s.replaceAll("<[^>]*>", "");
        System.out.println(result);
    }
}
