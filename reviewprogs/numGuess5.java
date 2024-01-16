import java.util.Scanner;
import java.util.Random;

class multTables2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randNum = random.nextInt(10) + 1;
        System.out.println("guess a number 1-10: ");

        while(true)
        {
            int userGuess = scanner.nextInt();

            if(userGuess < randNum)
            {
                System.out.println("this is too low try again: ");
            }
            else if(userGuess > randNum)
            {
                System.out.println("this is too high try again: ");
            }
            else
            {
                System.out.println("you got it");
            }
        }
    }
}