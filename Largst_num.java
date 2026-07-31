import java.util.Scanner;

public class Largst_num{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter Second Number: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter Third Number: ");
        int number3 = scanner.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("Largest Number: " + number1);
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("Largest Number: " + number2);
        } else {
            System.out.println("Largest Number: " + number3);
        }

        scanner.close();
    }
}