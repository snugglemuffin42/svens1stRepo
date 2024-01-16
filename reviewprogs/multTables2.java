import java.util.Scanner;
class multTables2
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter and number: ");
        int userNum = scanner.nextInt();

        for(int i = 1; i <= 12; i++)
        {
            System.out.println(userNum + " x " + i + " = " + (userNum * i));
        }
    }
}