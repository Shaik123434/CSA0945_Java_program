import java.util.Scanner;

public class SkipNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter M: ");
        int M = input.nextInt();
        
        System.out.print("Enter N: ");
        int N = input.nextInt();
        
        System.out.print("Enter K: ");
        int K = input.nextInt();
        
        for (int i = M; i <= N; i += (K + 1)) {
            System.out.print(i + (i + K < N ? ", " : ""));
        }
        
        input.close();
    }
}
