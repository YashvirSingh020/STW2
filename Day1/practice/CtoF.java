import java.util.*;

public class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float f = (float)(1.8 * c + 32);
        System.out.println(f);
        sc.close();
    }
}
