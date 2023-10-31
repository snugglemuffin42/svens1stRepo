import java.util.Scanner;
import java.util.Random;
class numGuess
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);
        Random random = new Random();

        int minimum = 1;
        int maximum = 500;
        int randNum = random.nextInt(maximum - minimum + 1);
        int userGuess;

        System.out.println("helo, i picka da numba from 1-500 can thou geuss it? 😱😱");

            while(true)
            {
                System.out.print("enter thou guess: ");
                userGuess = inputScanner.nextInt();

                if(userGuess == randNum)
                {
                    System.out.println("bruh you got it💀");
                break;
                }
                else if(userGuess < randNum)
                {
                    System.out.println("you too low, go up↑");
                }
                else
                {
                    System.out.println("you too up, go down⬇️");
                }
            }
    }
}