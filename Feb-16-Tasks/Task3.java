public class Task3 {
    public static void main(String[] args) {
        String s = "101,Ravi,50000";
        String[] a = s.split(",");
        if (a.length == 3)
            System.out.println("ID:" + a[0] + " Name:" + a[1] + " Salary:" + a[2]);
    }
}
