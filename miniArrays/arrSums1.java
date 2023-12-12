import java.util.Scanner;

class arrSums1
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size = 5;

        int[] arr = new int[size];

        System.out.println("Enter 5 elemetns to be added in an array: ");

        for(int i = 0; i < size; i++)
        {
            System.out.print(i + 1 + ": ");
            arr[i] = scan.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < arr.length; i++)
        {
            sum += arr[i];
        }

        System.out.println("the sum is: " + sum);
    }
}