import java.util.Scanner;
class arrayPrinter
/*I highly based this off of Ms. Lindsey's code in Google Classroom. I do understand it tho*/
{
    public static void main(String args[])
    {
        int [] intArray = new int[20];

        for(int i = 0; i < 20; i++)
        {
            intArray[i] = i+1;
        }
        String [] classList = new String[150];
        Scanner scan = new Scanner(System.in);

        boolean flag = false;
        int index = 0;

        while(flag != true)
        {
            System.out.print("enter any amount of strings then say \"exit\" if you wanna stop: ");

            String temp = scan.nextLine();

            if(temp.equals("exit"))
            {
                flag = true;
            }
            else
            {
                classList[index] = temp;
                index++;
            }

            if(index > 149)
            {
                System.out.print("too much, i only do up to 150 bru");
                flag = true;
            }
        }

        index = 0;

        while(classList[index] != null)
        {
            System.out.println(classList[index]);
            index++;
        }
    }
}