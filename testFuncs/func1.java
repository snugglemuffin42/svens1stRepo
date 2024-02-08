import java.util.Scanner;

class func1
{
    public static void main(String args[])
    {
        int result = numbMult();
        System.out.println("The result of these numbers is: " + result);
    }
    public static int numbMult()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter 1rd number ");
        int num1 = scanner.nextInt();

        System.out.print("enter 2st number ");
        int num2 = scanner.nextInt();

        /*Closes the scanner*/
        scanner.close();

        int multResult = num1 *= num2;
        return multResult;
    }
}