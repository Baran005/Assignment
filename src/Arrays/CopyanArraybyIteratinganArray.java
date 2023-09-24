package Arrays;
import java.util.Arrays;
public class CopyanArraybyIteratinganArray {

    public static void main(String [] args){

        int arr[] = {1,2,3,4,5};
        int []new_arr = new int [5];
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
           new_arr[i] = arr[i];
            System.out.println(Arrays.toString(new_arr));
        }

    }
}
