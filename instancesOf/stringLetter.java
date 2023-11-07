import java.util.Scanner;
class stringLetter
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter any string plese (a word)");
        String userString = inputScanner.next();
        System.out.println("Enter any leter plese");
        String userLetter = inputScanner.next();

        int letCheck = 0;

            for (int i = 0; i < userString.length(); i++)
            {
                if (userString.charAt(i) == userLetter.charAt(0))
                {
                    letCheck++;
                }
            }
            if (letCheck > 0)
            {
                System.out.println("the letter " + userLetter + " appears like " + letCheck + " tims");
            }
            else
            {
                System.out.println("dis no work (letter not found)");
            }
    }
}