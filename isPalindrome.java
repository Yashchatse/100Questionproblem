
import java.util.*;

// palindrome is word , pharse can read backward as forward same ignoring space , punctuation .
public class isPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        // int slen = s1.length();
        s1 = s1.toLowerCase().trim();

        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            rev = rev + s1.charAt(i);
        }

        if (s1.equals(rev)) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("is not  Palindrome");
        }

    }
}
