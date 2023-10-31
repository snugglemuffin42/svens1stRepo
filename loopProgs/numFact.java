import java.util.Scanner;
class numFact
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int userNum=inputScanner.nextInt();
        int finalAns = 1;

            for(; userNum > 0; userNum--)
            {
            finalAns *= userNum;
            }
        System.out.println(finalAns);
    }
}