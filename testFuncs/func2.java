import java.util.Scanner;

class func2
{
    public static void main(String args[])
    {
        int result = factorialEnd();
        System.out.println("The factorial is: " + result);
    }
    public static int factorialEnd()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number to be factorialized: ");
        int factNum = scanner.nextInt();

        scanner.close();

        int factorial = 1;    

        for(int i = factNum; i >= 1; i--)
        {
            factorial *= i;
        }
        return factorial;
    }
}