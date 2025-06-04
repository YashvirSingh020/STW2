package Day1;
import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        int[] arr = new int[26];
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            arr[(int)s.charAt(i) - 'a']++;
        }
        boolean[] f = new boolean[26];
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            if (!f[index]) {
                System.out.println(s.charAt(i) + " " + arr[(int)s.charAt(i) - 'a']);
                f[index] = true;
            }
        }
        sc.close();
    }
}
