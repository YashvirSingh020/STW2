import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Value: ");
        int t = sc.nextInt();
        int l = 0, r = n - 1;
        while (r >= l) {
            int m = (r + l) / 2 - l;
            if (arr[m] < t) {
                r = m - 1;
            }else if(arr[m] > t){
                l = m + 1;
            }else{
                System.out.println(t + " is present in position " + m);
                return;
            }
        }
        System.out.println(t + " is not present in array.");
        sc.close();
    }
}
