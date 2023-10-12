import java.util.Scanner;
class tempF
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("What is the temp in Fahrenheit?");
        System.out.print("Enter here: ");
        float tempChange = inputScanner.nextInt();

        tempChange -= 32;
        tempChange *= 0.56;

        System.out.println("It is " + tempChange + " Celciuns.");
    }
}