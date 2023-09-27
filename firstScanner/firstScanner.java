import java.util.Scanner;
class Scan 
{
    public static void main(String args[]) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Run them pockets (Enter the amount of cash you have)");
        System.out.print("Enter here (Do not use any symbols): ");
        int cashAmt = inputScanner.nextInt();

        System.out.print("Enter the amount of cash you would like to give me: ");
        double depositAmt = inputScanner.nextDouble();

        System.out.print("Enter any number for the tax rate (should be in decimal form.): ");
        double taxAmt = inputScanner.nextDouble();

        cashAmt -= depositAmt;
        cashAmt *= (1-taxAmt);

        System.out.print("But I'm generous and give you $5 back. ");

        cashAmt += 5;

        System.out.println("You have $" + cashAmt + " dollas.");
    }
}
