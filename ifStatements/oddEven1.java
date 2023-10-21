import java.util.Scanner;
class oddEven
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Pick any number:");
        int userNum = inputScanner.nextInt();

        if (userNum % 2 == 0)
        {
            System.out.println("Your number is even💯");
        }
        else
        {
            System.out.println("Your number is odd🤤");
        }
    }
}