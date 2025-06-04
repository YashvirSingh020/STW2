package Day1;

public class SecondMin {
    public static void main(String[] args) {
        int[] arr = { 4, 6, 12, 5, 0, 3 };
        int s = Integer.MAX_VALUE;
        int ss = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < s) {
                ss = s;
                s = arr[i];
            } else if (arr[i] < ss && arr[i] != s) {
                ss = arr[i];
            }
        }
        System.out.println(ss);
    }
}
