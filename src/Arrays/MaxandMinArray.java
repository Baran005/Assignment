package Arrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxandMinArray {

    public static void main(String [] args){
          int arr[]= {10,30,90,5,25};
        //String arr[] = {"Kota","keladu","kundi","lee","aadu"};
          Arrays.sort(arr);
          for(int i=0; i<arr.length; i++){
              System.out.println(arr[i]);
          }
        System.out.println("max- "+ arr[0]);
        System.out.println("min- "+ arr[arr.length-1]);

    }
}
