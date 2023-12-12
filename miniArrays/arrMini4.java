import java.util.Scanner;

class arrMini4
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

        int minimum = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] < minimum)
            {
                minimum = arr[i];
            }
        }

        System.out.println("the miniumum  is: " + minimum);
    }
}