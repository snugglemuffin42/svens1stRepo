import java.util.Scanner;
class palindrome3
{
    public static void main(String args[])
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("enter any word, and I will see if it is the same backward: ");
        String userWord = inputScanner.nextLine();

        int length = userWord.length();
        boolean palindrome = true;

        /*I used GeeksForGeeks to understand .toCharArray*/
        char[] wordArray = userWord.toCharArray();

        for(int i = 0; i < length / 2 && palindrome; i++)
        {
            if(wordArray[i] != wordArray[length - 1 - i])
            {
                palindrome = false;
            }
        }
            if(palindrome)
            {
                System.out.print("this is a palindrome.");
            }
            else
            {
                System.out.print("this is not a palindrome.");
            }
    }
}