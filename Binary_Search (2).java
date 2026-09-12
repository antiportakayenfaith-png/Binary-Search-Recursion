import java.util.Arrays;
import java.util.Scanner;

/*
 * Description: This program performs a recursive binary search. It accepts the number of elements, the array elements,
 *              and the target value from the user. The array is sorted in ascending order before the binary search is performed.
 * Programmed by: <Antiporta, Kayen Faith S.> <BSIT-2> <48079> <CC104>
 * Last Modified: September 11, 2026
 * Version: 1.0
 * Acknowledgements:
 * - Original Binary Search program provided in the Midterm module.
 * - OpenAI ChatGPT (GPT-5.6 Luna) was used to help explain and modify
 *   the recursive binary search program based on the laboratory instructions.
 */

public class Binary_Search {

    public static int bSearch(int[] arr, int target, int low, int high) {

        // Displays every recursive call
        System.out.println(
            "binarySearch(" + low + ", " + high + ", " + target + ")"
        );

        // Base case: target not found
        if (low > high) {
            return -1;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // Base case: target found
        if (arr[mid] == target) {
            return mid;
        }

        // Search left half
        if (target < arr[mid]) {
            return bSearch(arr, target, low, mid - 1);
        }

        // Search right half
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

        // Sort the array before binary search
        Arrays.sort(numbers);

        System.out.print("Target: ");
        int target = input.nextInt();

        // Perform recursive binary search
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
