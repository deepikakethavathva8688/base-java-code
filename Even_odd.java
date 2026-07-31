import java.util.Scanner;
public class Even_odd {
    public static void main(String[] args) {
        // int number = 20;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a age:");
        int age = scanner.nextInt();
        if(age >= 18) {
            System.out.println(age + " is eligible to vote.");
        } else {
            System.out.println(age + " is not eligible to vote.");
        }
    }
}