import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int original = n;
        System.out.println("original number is "+n);
        int reversed=0;
        while(n>0){
            int m = n%10;
            reversed = reversed*10+m;
            n = n/10;
        }
        System.out.println("reversed number is "+reversed);
        if (original==reversed){
            System.out.println("PALINDROME!!");
        }else{
            System.out.println("NOT PALINDROME:(");
        }

    }
}
