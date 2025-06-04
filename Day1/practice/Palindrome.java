import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(Palindrome(a)){
            System.out.println(a + " is a Palidrome.");
        }else{
            System.out.println(a + " is NOT a Palidrome.");
        }
        sc.close();
    }
    public static boolean Palindrome(int a){
        if(a == reverse(a))return true;
        return false;
    }
    public static int reverse(int a) {
        int rev = 0;
        for (int i = a; i > 0; i /= 10) {
            int r = i % 10;
            rev = rev * 10 + r;
        }
        return rev;
    }
}
