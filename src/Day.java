import java.util.Scanner;
public class Day {
    public static void main(String [] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Number bw 1 and 7 : ");

        int day = userInput.nextInt();

        switch(day){
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Invalid Number");

        }

    }
}
