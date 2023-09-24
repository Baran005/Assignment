package Arrays;
import java.util.Arrays;
public class Equalrnot {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {1, 2, 5, 4, 0};

        boolean equal = Arrays.equals(arr1, arr2);

        if (equal) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
