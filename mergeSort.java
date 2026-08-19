
import java.util.Scanner;

public class mergeSort {

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

        int len = nums.length;

        merSort(nums, 0, len - 1);
        display(len, nums);
    }

    static void merSort(int[] nums, int left, int right) {
        int mid;
        if (left < right) {
            mid = left + (right - left) / 2;
            merSort(nums, left, mid);
            merSort(nums, mid + 1, right);
            Merge(nums, left, mid, right);
        }

    }

    static void Merge(int[] nums, int left, int mid, int right) {

        int i, j, k;
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (i = 0; i < n1; i++) {
            L[i] = nums[left + i];
        }
        for (j = 0; j < n2; j++) {
            R[j] = nums[mid + 1 + j];
        }
        i = 0;
        j = 0;
        k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums[k] = L[i];
                i++;
            } else {
                nums[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            nums[k] = L[i];
            i++;
            k++;
        }
        // Copy the remaining elements of R[], if any
        while (j < n2) {
            nums[k] = R[j];
            j++;
            k++;
        }
    }

    static void display(int len, int[] nums) {
        for (int i = 0; i < len ; i++) {
            System.out.println(nums[i]);
        }
    }
}
