import java.util.Scanner;

class arrMax3
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

        int max = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }

        System.out.println("the masximum  is: " + max);
    }
}