import java.util.Scanner;
class simpleCalc
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter a number (1-9), choose what you would like to do with that number (+,-,*,/), then choose another number (1-9)");
        int num1 = inputScanner.nextInt();
        char op = inputScanner.next().charAt(0);
        int num2 = inputScanner.nextInt();
        int result = 0;

        if (op == '+')
        {
            result = num1 + num2;
            System.out.println("This equals: " + result);
        }
        else if (op == '-')
        {
            result = num1 - num2;
            System.out.println("This equals: " + result);
        }
        else if (op == '*')
        {
            result = num1 * num2;
            System.out.println("This equals: " + result);
        }
        else if (op == '/')
        {
            result = num1 / num2;
            System.out.println("This equals: " + result);
        }
        else
        {
            System.out.println("This is an invalid input, try again.");
        }
    }
}