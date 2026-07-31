import java.util.Scanner;
public class LeapYear{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year :");
        int num = sc.nextInt();
        if(num  % 4 == 0){
            System.out.println("This Leap Year");
        }
        else
            System.out.println("This not Leap Year");

    }
}