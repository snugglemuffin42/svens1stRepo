import java.util.Scanner;
class stringRev
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a word (no numbers)");
        String userWord=inputScanner.next();

            for(int i = userWord.length() - 1; i >= 0; i--)
            {
                System.out.print(userWord.charAt(i));
            }
    }
}