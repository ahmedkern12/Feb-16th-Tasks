import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        Random r = new Random();
        int otp = 100000 + r.nextInt(900000);
        System.out.println(otp);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n == otp ? "Verified" : "Invalid");
    }
}