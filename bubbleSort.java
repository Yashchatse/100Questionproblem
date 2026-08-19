
import java.util.*;

public class bubbleSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Input logic 
        System.out.print("Enter the Number to Sort: ");
        String st = sc.nextLine();
        String[] values = st.split(" ");

        int[] nums = new int[values.length];

        for (int i = 0; i < values.length; i++) {
            nums[i] = Integer.parseInt(values[i]);
        }
        // Bubble Sort Logic
        
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i- 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
