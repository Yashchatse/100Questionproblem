
import java.util.Scanner;

// perfect number  if the number can added to 
public class isPerfectNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp =0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                temp = temp + i;
            }
        }
       if(temp == num){
        System.out.println("Its perfect Num");
       }else{
        System.out.println("Its not");
       }
    }
}