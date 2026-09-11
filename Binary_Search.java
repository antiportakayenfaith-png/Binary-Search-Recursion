import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

    // Modified recursive binary search function
    public static int bSearch(int[] arr, int target, int low, int high) {
        System.out.println("binarySearch(" + low + ", " + high + ", " + target + ")");

        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }

        return bSearch(arr, target, mid + 1, high);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        System.out.print("Target: ");
        int target = input.nextInt();

        int result = bSearch(numbers, target, 0, numbers.length - 1);

        if (result == -1) {
            System.out.println("Target not found.");
            System.out.println("Index: -1");
        } else {
            System.out.println("Target found.");
            System.out.println("Index: " + result);
        }

        input.close();
    }
}
