import java.util.Scanner;

class arrAverage2
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size = 5;

        int[] arr = new int[size];

        System.out.println("Enter 5 elemetns for an array: ");

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

        int avg = sum / size;

        System.out.println("the average is: " + avg);
    }
}