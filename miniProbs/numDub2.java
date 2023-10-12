import java.util.Scanner;
class numDub
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("You decide to invest into stocks.");
        System.out.println("Luckily, Gamestop is rising, and your investment would double in a month!");
        System.out.print("How much will you invest (don't put symbols pls): ");
        int stonks = inputScanner.nextInt();

        stonks*= 2;

        System.out.println("You have $" + stonks + "!");
        System.out.println("Uh oh, you got greedy and invested more, but the market crashed :O");
        System.out.println("You have negative a grillion dollars now");
    }
}