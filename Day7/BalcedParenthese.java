package Day7;
import java.util.*;;
public class BalcedParenthese {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String string = "{{{[[(())]]}}}";
        boolean isBalance = true;
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                s.add(c);
            }
            else if (c == '}' || c == ']' || c == ')') {
                if (s.isEmpty() || !isMatching(s.pop(),c)) {
                    isBalance = false;
                    break;
                }
            }
        }
        if (!isBalance) {
            isBalance = false;
        }
        if (isBalance) {
            System.out.println(string + " is Balanced.");
        }else{
            System.out.println(string + " is NOT Balanced.");
        }
    }
    public static boolean isMatching(char a,char b){
        return (a == '[' && b == ']') || (a == '{' && b == '}') || (a == '(' && b == ')');
    }
}
