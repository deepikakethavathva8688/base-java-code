import java.util.Scanner;
public class Swapping{
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number1:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Number2:");
        int num2 = scanner.nextInt();
        //int 
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
         System.out.println(" After Swapping ");
         System.out.println("First =:"+ num1);
         System.out.println("second = :" + num2);
        //  Scanner.close();

    }
}