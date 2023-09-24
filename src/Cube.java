import java.lang.Math;
import java.util.Scanner;

public class Cube {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();

       for(double i=1;i<=n;i++)
       {

        System.out.println("Number is : " + i + "and cube of" + i + "is: " + Math.pow(i,3));}

    }
}



