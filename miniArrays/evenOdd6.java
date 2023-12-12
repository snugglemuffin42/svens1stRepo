import java.util.Scanner;

class evenOdd6
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

        System.out.println("The even numbers are: ");
        for(int i = 0; i < size; i++)
        {
            if(arr[i] % 2 == 0)
            {
                System.out.println(arr[i] + " ");
            }
        }

        System.out.println("The odd numbers are: ");
        for(int i = 0; i < size; i++)
        {
            if(arr[i] % 2 != 0)
            {
                System.out.println(arr[i] + " ");
            }
        }
    }
}