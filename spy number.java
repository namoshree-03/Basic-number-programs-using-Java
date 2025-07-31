import java.util.Scanner;
public class spy {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        int a = n;
        while (a>0){
            int digit = a%10;
            sum = sum+digit;
            product = product*digit;
            a = a/10;
        }
        if (sum == product){
            System.out.println("SPY NUMBER");
        }else{
            System.out.println("NOT A SPY NUMBER");
        }
    }
}
