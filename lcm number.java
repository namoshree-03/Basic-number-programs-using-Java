import java.lang.Math;
import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        int a = Math.max(num1, num2);
        for (int i=1; i<=10; i++){
            int n = a*i;
        }

    }

}


