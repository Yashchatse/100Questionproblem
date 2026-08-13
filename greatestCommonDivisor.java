
import java.util.Scanner;


public class greatestCommonDivisor{
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the First number: ");
     int Firstnum = sc.nextInt();
        System.out.println("Enter the First number: ");
     int SecondNum = sc.nextInt();

     int n = 1;
        if(Firstnum != SecondNum){
            
            while(n != 0){
                n = Firstnum % SecondNum;
                if(n != 0){
                    Firstnum = SecondNum;
                    SecondNum = n;
                }
            }
            System.out.println("RESULT is "+ SecondNum);
        }

    }
}