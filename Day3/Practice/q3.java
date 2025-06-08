package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class q3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= 7; i++) arr.add(i);
        int k = 3;

        k = k % arr.size();

        Collections.rotate(arr, k);

        System.out.println("Rotated ArrayList: " + arr);
    }
}
