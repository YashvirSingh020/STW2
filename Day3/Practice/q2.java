
package Practice;
import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr.get(i) == arr.get(j)) {
                    arr.set(j, 0);
                }
            }
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                System.out.print(arr.get(i) + " ");
            }
        }
        sc.close();
    }
}
