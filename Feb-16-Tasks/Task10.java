import java.util.*;

public class Task10 {
    public static void main(String[] args) {
        String log = "INFO Start\nERROR Failed\nINFO Retry\nERROR Crash";
        int count = 0;
        Scanner sc = new Scanner(log);
        while (sc.hasNextLine())
            if (sc.nextLine().contains("ERROR"))
                count++;
        System.out.println(count);
    }
}
