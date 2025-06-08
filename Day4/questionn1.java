
// package Day4;
import java.util.*;

public class questionn1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(powerofthree(n));
        sc.close();
    }

    public static boolean powerofthree(int n) {
        if (n <= 0 || n != 0)
            return false;
        if (n == 1)
            return true;
        return powerofthree(n / 3);
    }
}
