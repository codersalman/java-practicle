
import java.util.Scanner;

public class arthmeticOpration {
    public static void main(String[] args) {
        int x, y, sum;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Type a number:");
        x = myObj.nextInt();
        System.out.println("Type another number:");
        y = myObj.nextInt();
        sum = x + y;
        System.out.println("Addition is:" + sum);
        sum = x - y;
        System.out.println("Substration is:" + sum);
        sum = -x * y;
        System.out.println("Multiplication is:" + sum);
        sum = x / y;
        System.out.println("Division is:" + sum);
    }
}