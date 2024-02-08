import java.util.Scanner;

class funcArray
{
    public static void main(String args[])
    {
        int[] array = {42, 84, 294, 424, 505, 517, 532, 592, 727, 952};
        System.out.print("The array is: ");
        printArray(array);

        int avg = averageArray(array);
        System.out.print("avergage is: " + avg);
    }
    public static int averageArray(int[] arr)
    {
        int sum = 0;    

        for(int num : arr)
        {
            sum += num;
        }
        return (int) sum / arr.length;
    }
    public static void printArray(int[] arr)
    {
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}