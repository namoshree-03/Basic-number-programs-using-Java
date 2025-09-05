import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers you want in the array");
        int n = sc.nextInt();
        int[] myArray = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }
        System.out.println("\nYour entered array elements are:");
        for (int j = 0; j < n; j++) {
            System.out.print(myArray[j] + " ");
        }
        System.out.println();
        sc.close();

        int sum = 0;
        for (int k = 0; k < n; k++) {
            if (myArray[k] % 2 == 0) {
                sum = sum + myArray[k];
            }
        }
        System.out.println("The sum of even numbers in the array is "+sum);
    }
}
