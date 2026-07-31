import java.util.Scanner;
public class Circle{
    public static void main(String[] agrs){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Circle of Radius:");
        int radius = scanner.nextInt();
        int area = 3.14 * radius * radius ;
        System.out.println("Enter Radius:" + area);

    }
}