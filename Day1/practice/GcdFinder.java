import java.util.Scanner;

public class GcdFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcdfinder(a, a % b));
        sc.close();
    }

    public static int gcdfinder(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdfinder(b, a % b);
    }
}
