import java.lang.Math;
import java.util.Scanner;
public class FloatingnumPstveRNegve {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        double n = sc.nextInt();


            if(n>0){
                if(n<1){
                    System.out.println("Positive small");
                }
                else if(n>1000000) {
                    System.out.println("Positive Large");
                }
                else{
                    System.out.println("Positive");
            }
        }
            else if(n<0){
                if(Math.abs(n)<1){
                    System.out.println("Negative Small");
                }
                else if(Math.abs(n)>1000000){
                    System.out.println("Negative Large");
                }
                else{
                    System.out.println("Negative");
                }
            }
            else{
                System.out.println("Zero");
            }


    }
}


