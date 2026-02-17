public class Task2 {
    public static void main(String[] args) {
        String url = "https://example.com";
        boolean valid = url.matches("^(http://|https://).+");
        System.out.println(valid);
    }
}