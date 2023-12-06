import java.util.Scanner;

class revArray
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size;
        int temp;

        System.out.print("What is the size of your array: ");
        size = scan.nextInt();

        int[] intArray = new int[size];

        for (int i = 0; i < size; i++) 
        {
            System.out.print("enter value): ");
            intArray[i] = scan.nextInt();
        }
        for (int i = 0, j = size - 1; i < size / 2; i++, j--)
        {
            temp = intArray[j];
            intArray[j] = intArray[i];
            intArray[i] = temp;
        }
        for (int i = 0; i < size; i++)
        {
            System.out.print(intArray[i] + " ");
        }
    }
}