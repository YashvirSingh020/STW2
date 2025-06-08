// package Practice;

import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();
        String c = "";
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) != ' ') {
                c += s.charAt(i);
            } else {
                if (!c.isEmpty()) {
                    mp.put(c, mp.getOrDefault(c, 0) + 1);
                    c = "";
                }
            }
        }
        if (!c.isEmpty()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for(String a : mp.keySet()){
            System.out.println(a + " " + a.length());
        }
        sc.close();
    }
}
