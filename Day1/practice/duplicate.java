import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] unique = new int[n];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(!isPresent(unique, arr[i], index)){
                unique[index++] = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
    public static boolean isPresent(int[] arr,int num,int lenght){
        for(int i = 0;i<=lenght;++i){
            if(num == arr[i])return true;
        }
        return false;
    }
}
