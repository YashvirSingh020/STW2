import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (armstrong(a)) {
            System.out.println(a + " is a armstrong number.");
        }else{
            System.out.println(a + " is a NOT armstrong number.");

        }
        sc.close();
    }
    public static int power(int a, int b){
        for(int i = 1;i<b;++i){
            a *= a;
        }
        return a;
    }
    public static boolean armstrong(int a){
        int c = 0;
        int t = a;
        int armnum = 0;
        while (t >0) {
            t /= 10;
            c++;
        }
        for (int i = a; i > 0; i/=10) {
            int r = i % 10;
            armnum += power(r, c);
        }
        if(armnum == a)return true;
        return false;
    }

}
