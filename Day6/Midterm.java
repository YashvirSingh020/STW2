// package Day6;
import java.util.*;
public class Midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        midElement(arr, 0, arr.length-1);
        sc.close();
    }
    public static void midElement(int[] arr,int s,int e){
        if (s == e) {
            System.out.println("Middle Term: " + arr[s]);
            return;
        }
        if (s + 1 == e) {
            System.out.println("Middle terms are: " + arr[s] +  " " + arr[e]);
            return;
        }
        int a = s + 1;
        int b = e - 1;
        midElement(arr, a, b);
    }
}
