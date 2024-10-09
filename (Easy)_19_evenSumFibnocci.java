 System.out.println();import java.util.Scanner;

public class EvenSumFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int sum = 0;
        int a = 0, b = 1;
           
        for (int i = 0; i <= n*2; i++) {
             System.out.print(a + ((i < n*2) ? ", ":""));
            if (i % 2 == 0) {
                sum += a;
            }
            int next = a + b;
            a = b;
            b = next;
        }
         System.out.println();

        System.out.println("Sum of numbers at even indexes = " + sum);
        scanner.close();
    }
}
