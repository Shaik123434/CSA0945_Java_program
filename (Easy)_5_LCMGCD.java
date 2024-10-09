import java.util.Scanner;

public class LCMGCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int gcd = numbers[0];
        int lcm = numbers[0];

        for (int i = 1; i < n; i++) {
            gcd = findGCD(gcd, numbers[i]);
            lcm = findLCM(lcm, numbers[i]);
        }

        System.out.println("GCD of the given numbers: " + gcd);
        System.out.println("LCM of the given numbers: " + lcm);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }
}
