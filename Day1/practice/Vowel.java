import java.util.*;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        switch (c) {
            case 'a':
                System.out.println(c + " It is a vowel");
                break;
            case 'b':
                System.out.println(c + " It is a vowel");
                break;
            case 'c':
                System.out.println(c + " It is a vowel");
                break;
            case 'd':
                System.out.println(c + " It is a vowel");
                break;
            case 'e':
                System.out.println(c + " It is a vowel");
                break;
        
            default:
                System.out.println(c + " It is a consonant");
                break;
        }
        sc.close();
    }
}
