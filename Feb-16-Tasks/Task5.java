import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        String s = "This is a test this is only a test";
        String[] words = s.toLowerCase().split("\\W+");
        Map<String,Integer> m = new HashMap<>();
        for(String w:words) m.put(w,m.getOrDefault(w,0)+1);
        for(String w:m.keySet()) if(m.get(w)>1) System.out.println(w);
    }
}