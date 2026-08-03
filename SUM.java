import java.util.Scanner;
public class SUM{
    public static void main(String[] agrs){
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
         a = sc.nextInt();
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number :");
        b = num.nextInt();
        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter the number :");
        c = num.nextInt();
        if(a >= b && a >= c){
            System.out.println("this Great number :" + a);
        }
        else if( b >= a && b >= c){
            System.out.println("this great number :" + b);
        }
        else {
            System.out.println("this great number :" + c);
        }
    }
}