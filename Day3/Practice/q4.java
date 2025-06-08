package Practice;

import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vec = new Vector<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            vec.add(sc.nextInt());
        }

        Collections.reverse(vec);

        System.out.println("Reversed Vector: " + vec);// printing vector
        sc.close();
    }
}
