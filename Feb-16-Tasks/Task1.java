import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        String s = "Kern Software Solutions";
        String username = s.toLowerCase().replaceAll("[aeiou\\s]", "");
        System.out.println(username);
    }
}