import java.util.Scanner;
class leapYear
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a year");
        int userYear = inputScanner.nextInt();

        if (userYear % 4 == 0)
        {
            System.out.println("This is a leap year.");
        }
        else
        {
            System.out.println("This is not a leap year.");
        }
    }
}