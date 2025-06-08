package Practice;

import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<String, Integer> mp = new HashMap<String, Integer>();
        String string = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                string = string + s.charAt(i);
            }else{
                mp.put(string, string.length());
                string = "";
            }
        }  
        System.out.println(mp); 
        sc.close();
    }
}
