import java.util.Scanner;
class average4
{
    public static void main(String args[])
    {
        Scanner inputScanner = new Scanner(System.in);
        
        
        System.out.println("enter any numbers, and I will calculate the average of them: ");
        int[] userNums = new int[10];

        for(int i = 0; i < 10; i++)
        {
            System.out.print("enter a number " + (i + 1) + ": ");
            userNums[i] = inputScanner.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < userNums.length; i++)
        {
            sum += userNums[i];
        }
        int avg = sum / userNums.length;
        System.out.println("the average of the numbers is " + avg);
    }
}