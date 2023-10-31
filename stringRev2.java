import java.util.Scanner;
class stringRev2
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a word (no numbers)");
        String daWord = inputScanner.nextLine();

        String droWad = "";

            //reverses the string
            for(int i = 0; i < daWord.length(); i++)
            {
                droWad += daWord.charAt(daWord.length() - 1 - i);
            }

            // do the goofy printing
            for(int i = 0; i < droWad.length(); i++)
            {
                System.out.println(droWad.substring(i));
            }
    }
}