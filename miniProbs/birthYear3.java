import java.util.Scanner;
class birthYear
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("To verify your age, you must enter your birth year.");
        System.out.print("Enter here plaese: ");
        int brithYear = inputScanner.nextInt();
        int nowYear = 2023;
        int urAge = nowYear - brithYear;

        System.out.println("You are " + urAge + " years old.");
    }
}