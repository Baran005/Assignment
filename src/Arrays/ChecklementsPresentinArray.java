
package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ChecklementsPresentinArray {


        public static void main(String[] args) {
            // Given array
            int[] arr1 = {5, 1, 1, 9, 7, 2, 6, 10};
            int key1 = 7;

            int[] arr2 = {-1, 1, 5, 8};
            int key2 = -2;

            // Check if key1 is present in arr1
            boolean result1 = isElementPresent(arr1, key1);
            System.out.println("Is key1 present in arr1? " + result1);

            // Check if key2 is present in arr2
            boolean result2 = isElementPresent(arr2, key2);
            System.out.println("Is key2 present in arr2? " + result2);
        }

        // Function to check if an element is present in an array
        public static boolean isElementPresent(int[] arr, int key) {
            for (int element : arr) {
                if (element == key) {
                    return true;
                }
            }
            return false;
        }
    }


