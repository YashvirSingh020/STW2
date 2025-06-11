// package Day7;
import java.util.*;

public class Squareroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int low = 0, high = n, ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid * mid == n) {
                ans = mid;
                break;
            } else if (mid * mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Square root of " + n + " is " + ans);
        sc.close();
    }
}
