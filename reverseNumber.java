
import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        // reverseing the number 107809
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        int rev = 0;
        while (n != 0) {
            int num = n % 10;
            rev = rev * 10 + num;
            n = n / 10;
        }
        System.out.println("Reversed number: " + rev);

    }
}
