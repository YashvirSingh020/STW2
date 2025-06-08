package Practice;
import java.util.*;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            add(arr,sc.nextInt());
        }
        System.out.println("Enter element to search");
        // System.out.println(arr.contains(sc.nextInt()));
        System.out.println(search(arr, sc.nextInt()));
        sc.close();
    }
    public static void add(ArrayList<Integer> arr,int add){
        arr.add(add);
    }
    public static boolean search(ArrayList<Integer> arr,int num){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) == num){
                return true;
            }
        }
        return false;
    }
}
