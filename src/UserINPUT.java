import java.util.Scanner;

public class UserINPUT {
         public static void main(String []args){

           Scanner userInput = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1 = userInput.nextInt();
        System.out.println("Enter Second number:");
        int num2= userInput.nextInt();
        System.out.println("Enter Third Number:");
        int num3 = userInput.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("The Greatest: " + num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The Greatest: " + num2);}
        else {
            System.out.println("The Greatest: " + num3);}


    }
}
