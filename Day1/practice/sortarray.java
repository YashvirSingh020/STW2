import java.util.Scanner;

public class sortarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean f = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                f = false;
                break;
            }
        }
        if (f) {
            System.out.println("Sorted in Acending Order");
        }else{
            System.out.println("Not Sorted");
        }
        sc.close();
    }
}
