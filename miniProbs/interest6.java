import java.util.Scanner;
class interest
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("How much money do you owe to the IRS? ");
        int moneyOwed = inputScanner.nextInt();

        System.out.print("What is the interest rate on that? ");
        int interest = inputScanner.nextInt();

        float xtraMoney = (moneyOwed / 100) * interest;
        float allMoney = (xtraMoney + moneyOwed);

        System.out.println("This is the extra money you owe: $" + xtraMoney);
        System.out.println("This is everything you owe: $" + allMoney);
    }
}