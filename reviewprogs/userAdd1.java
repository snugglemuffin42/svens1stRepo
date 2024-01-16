import java.util.Scanner;
class userAdd1
{
    public static void main(String args[])
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("enter any numbers, enter any letter to stop");
        int sum = 0;

        while(inputScanner.hasNextInt())
        {
            sum += inputScanner.nextInt();
        }
        System.out.println("the sum is " + sum);
    }
}