
import java.util.Arrays;
import java.util.Scanner;

// what is anagram if two string contain same length and same frequecy of character is anagram
// Example tea and eat are Anagram
public class isAnagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String");
        String s1 = sc.nextLine();
        System.out.println("Enter 2nd String");
        String s2 = sc.next();

        if (s1.length() != s2.length()) {

            System.out.println("Its not Anagram");

        } else {
            char[] ar1 = s1.toLowerCase().toCharArray();
            char[] ar2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ar1);
            Arrays.sort(ar2);
            if (Arrays.equals(ar2, ar2)) {
                System.out.println("It's Anagram");
            } else {
                System.out.println("its not Anagram");
            }
        }
    }
}
