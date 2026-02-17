public class Task8 {
    public static void main(String[] args) {
        String file = "photo.png";
        int i = file.lastIndexOf('.');
        if (i != -1 && i < file.length() - 1)
            System.out.println(file.substring(i + 1));
    }
}
