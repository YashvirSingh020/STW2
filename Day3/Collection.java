// package Day3;

import java.util.*;

public class Collection {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<Integer>();
        // for (int i = 0; i < 7; i++) {
        // arr.add(i + 432 - i / 34);
        // }
        // for (int i = 0; i < 71; i++) {
        // System.out.print(arr.get(i) + " ");
        // }
        // arr.remove(5);

        // Vector<Integer> vec = new Vector<Integer>();
        // for (int i = 0; i < 8; i++) {
        // vec.add(i+43+i/2);
        // }
        // for (int i = 0; i < vec.size(); i++) {
        // System.out.print(vec.get(i)+ " ");
        // }
        // vec.remove(5);
        // System.out.println();
        // for (int i = 0; i < vec.size(); i++) {
        // System.out.print(vec.get(i) + " ");
        // }

        // HashMap<Integer, String> map = new HashMap<Integer, String>();
        // map.put(0,"Yashvir");
        // map.put(3,"Yash");
        // map.put(1,"Juno");
        // System.out.println(map.get(0));

        // Stack<Integer> st = new Stack<Integer>();
        // for(int i = 0;i<8;i++){
        // st.push(i);
        // }
        // while (!st.isEmpty()) {
        // System.out.println(st.peek() + " ");
        // st.pop();
        // }

        // Queue<Integer> que = new LinkedList<Integer>();
        // for (int i = 0; i < 7; i++) {
        // que.add(i);
        // }
        // while (!que.isEmpty()) {
        // System.out.println(que.poll());
        // }

        Scanner sc = new Scanner(System.in);
        /*
         * 1. ArrayList:
         * Write a program to store 10 integers in an ArrayList, then print only the
         * even numbers.
         */
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            arr.add(i, sc.nextInt());
        }
        for (Integer i : arr) {
            if (arr.get(i) % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }

}
