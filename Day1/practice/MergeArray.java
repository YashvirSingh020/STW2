import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("lenght of array 1");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("lenght of array 2");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter Element");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] result = mergeArray(arr,arr1);
        System.out.println("merged array");
        for (int i = 0; i < result.length; i++) {
            if(result[i] != 0){
                System.out.print(result[i] + " ");
            }
        }
        sc.close();
    }

    public static int[] mergeArray(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (!isPresent(result, a[i], index)) {
                result[index++] = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!isPresent(result, b[i], index)) {
                result[index++] = b[i];
            }
        }
        return result;
    }

    public static boolean isPresent(int[] arr, int num, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == num)
                return true;
        }
        return false;
    }
}
