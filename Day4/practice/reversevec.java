package practice;
import java.util.*;
public class reversevec {
    public static void main(String[] args) {
        Vector<Integer> vec = new Vector<>();
        Scanner sc = new Scanner(System.in);
        int n = 1;
        System.out.println("Enter 1 for entering value and 0 to exit");
        while (n == 0) {
            n = sc.nextInt();
            vec.add(sc.nextInt());
        }
        int l = 0,r = vec.size() - 1;
        while (l < r) {
            int t = vec.get(l);
            vec.set(l, vec.get(r));
            vec.set(r, t);            
        }
        sc.close();
    }
}
