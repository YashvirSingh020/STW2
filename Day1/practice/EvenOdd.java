import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),oc = 0,ec = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if ((arr[i] & 1) == 1) {
                oc++;
            }else{
                ec++;
            }
        }
        System.out.println(" Odd count are " + oc);
        System.out.println(" Even count are " + ec);
        sc.close();
    }
}
