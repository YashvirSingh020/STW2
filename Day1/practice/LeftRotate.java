import java.util.*;
public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int l = arr[n-1];
        for(int i = n-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = l;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
