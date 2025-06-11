// package Day6;

import java.util.*;

public class plates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // if (n <= 0) {
        // sc.close();
        // System.out.println("Invalid Input, Try diffrent Input");
        // return;
        // }
        // System.out.println(noofways(n));
        towerOfHanoi(n, 'A', 'C', 'B');
        sc.close();
    }

    public static int noofways(int n) {
        if (n == 1) {
            return 1;
        } else {
            return 2 * noofways(n - 1) + 1;
        }
    }

    public static void towerOfHanoi(int numOfBlock, char from, char to, char other) {

        // base condition
        if (numOfBlock == 0){
            return;
        }
        towerOfHanoi(numOfBlock - 1, from, other, to);
        System.out.println("Moving Block from " + from + " to " + to + " via " + other);
        towerOfHanoi(numOfBlock - 1, other, to, from);
    }
}
