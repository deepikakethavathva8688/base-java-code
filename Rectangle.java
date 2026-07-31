import java.util.Scanner;
public class Rectangle{
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length:");
        int length = scanner.nextInt();
        System.out.println("Enter Breadth :");
        int Breadth = scanner.nextInt();

         int Area = length * Breadth ;
        System.out.println("Area of Rectangle :" + Area);
    }
}
