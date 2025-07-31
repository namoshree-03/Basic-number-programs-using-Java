import java.util.Scanner;
public class armstrong {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int n = sc.nextInt();
        int count = 0;
        int a = n;
        System.out.println("Original number is " + n);
        while(a>0){
            count = count + 1;
            a = a/10;

        }
        int sum =0;
        int b = n;
        while (b>0){
            int digit = b%10;
            sum = sum + (int) (Math.pow(digit,count));
            b = b/10;
        }
        if (n == sum){
            System.out.println("ARMSTRONG");
        }else{
            System.out.println("NOT ARMSTRONG");
        }
        sc.close();
    }
}
