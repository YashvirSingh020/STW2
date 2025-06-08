// package Day3;

import java.util.HashMap;

public class Question1 {
    public static void main(String[] args) {
        char arr[] = {'a','b','a','c','d','b'};
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
        for (char c : arr) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        for(char k : mp.keySet()){
            System.out.println(k + " occurs " + mp.get(k));
        }
    }
}
