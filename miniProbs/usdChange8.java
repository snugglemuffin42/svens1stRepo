import java.util.Scanner;
class usdChange
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("You decide to travel to Zimbabwe, but you need to transfer you money.");
        System.out.print("How much money would you like to bring with you? ");
        int dollaChange = inputScanner.nextInt();

        int zimbabwe = dollaChange * 322;

        System.out.println("You have: " + zimbabwe + " ZWL.");
    }
}