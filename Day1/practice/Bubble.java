import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[j - 1]) {
                    int t = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = t;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
