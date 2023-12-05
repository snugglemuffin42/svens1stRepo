import java.util.Scanner;
class arrayDupe
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int size = 25;
        int [] intArray = new int[size];
        String[] stringArray = new String[size];

        System.out.println("put any 25 numbers (enter \"exit\" to stop)"); 
        int index = 0;
        boolean flag = false; 
        int i = 0;

        for (i = 0; i < size; i++) 
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            int userNum = scan.nextInt();
            intArray[i] = userNum;
        }

        while(i < size && !flag)
        {
            for (int j = i+1; j < size; j++)
            {
                if (intArray[i] == intArray[j])
                {
                    flag = true;
                    break;
                }
            }
        }
        if (flag)
        {
            System.out.println("the dupe(s) found was");
        }
        else
        {
            System.out.println("no dupes wer found");
        }
    }
}