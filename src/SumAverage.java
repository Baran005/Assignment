import java.util.Scanner;
import java.lang.Math;

public class SumAverage {
public static void main(String [] args)  {
    int i,sum=0,u;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the count:");
    int n = sc.nextInt();
    for( i=0;i<n;i++){
        System.out.println("Emter the nos:");
        u = sc.nextInt();
        sum +=u;
    }
   float avg = sum/n;
    System.out.println("The sum of numbers is " + sum);
    System.out.println("The avg is " + avg);

}
}
