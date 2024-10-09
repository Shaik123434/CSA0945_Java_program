import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the principal amount: ");
        int principal = input.nextInt();
        
        System.out.print("Enter the number of years: ");
        int years = input.nextInt();
        
        System.out.print("Is customer senior citizen (y/n): ");
        char isSeniorCitizen = input.next().charAt(0);
        
        double interest = calculateInterest(principal, years, isSeniorCitizen);
        System.out.print("Interest: " + interest);
    }

    public static double calculateInterest(int principal, int years, char isSeniorCitizen) {
        double rateOfInterest = (isSeniorCitizen == 'y') ? 0.12 : 0.10;
        return (principal * years * rateOfInterest) / 100;
    }
}
