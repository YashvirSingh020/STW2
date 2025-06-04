import java.util.Scanner;

public class MinMaxDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1 + i; j < arr.length; j++) {
                min = Math.min(min, Math.abs(arr[i]-arr[j]));
                max = Math.max(max, Math.abs(arr[i]-arr[j]));
            }
        }
        System.out.println("Minimum diffrence is " + min);
        System.out.println("Maximum diffrence is " + max);
        sc.close();
    }
}
