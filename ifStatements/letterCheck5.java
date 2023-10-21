import java.util.Scanner;
class letterCheck
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a letter");
        String userLet=inputScanner.next();
        userLet = userLet.toUpperCase();

        char userLetter = userLet.charAt(0);

        if((userLetter==65) || (userLetter==69) || (userLetter==73) || (userLetter==79) || (userLetter==85) || (userLetter==89))
        {
            System.out.println("This is a vowel.");
        }
        else
        {
            System.out.println("This is a consonant.");
        }
    }
}