import java.util.*;
public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Size of array");
        int[] arr = new int[n];
        System.out.println("Enter Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] visited = new boolean[n];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if(visited[i])continue;
            for (int j = 1 + i; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println("occurance of " + arr[i] + " is " + count);
        }
        sc.close();
    }
}
