package Day2;

public class SmallestPositivenumber {
    public static void mains(String[] args) {
        int[] arr = {2, -3, 4, 1, 1, 7};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        // Your code here
        int[] a = new int[(int) 1e6 + 10];
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > 0) {
                a[arr[i]]++;
            }
        }
        for (int i = 1; i < a.length; ++i) {
            if (a[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
