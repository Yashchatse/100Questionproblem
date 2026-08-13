
import java.util.Scanner;

public class fibonacciToNth {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inital = 0;
        int sec = 1;
        int res = 0;
        for(int i =3; i <= n ; i++) {
            res = inital + sec;
            inital = sec;
            sec = res;
        }
        System.out.println("The nth TERM is: " + res);
    }
}
