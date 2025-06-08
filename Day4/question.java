// package Day4;

import java.util.HashMap;

public class question {
    public static void main(String[] args) {
        int[] arr = { 0, 3, 4, 0, 0 };
        HashMap<Integer, Integer> occ = new HashMap<>();
        int n = arr.length;
        int[] zeroeven = new int[]{0, 0};
        array(arr, 0, zeroeven, occ);
        int result = ((n - zeroeven[0] - 1) * (n + zeroeven[0] - 2) * zeroeven[1]);
        System.out.println(zeroeven[0] + " " + zeroeven[1] + " " + occ);
        for (int keys : occ.keySet()) {
            if (occ.get(keys) != 1) {
                result = result / factorial(occ.get(keys));
            }
        }
        System.out.println(result);

    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    public static void array(int[] arr,int i,int[] zeroeven,HashMap<Integer,Integer> occ){
        if(i == arr.length)return;
        if(arr[i] == 0)zeroeven[0]++;
        if(arr[i] % 2 == 0)zeroeven[1]++;
        occ.put(arr[i],occ.getOrDefault(occ,0)+1);
        array(arr, i+1, zeroeven, occ);
    }
}
