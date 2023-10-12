import java.util.Scanner;
class tempC
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("What is the temp in Celcius?");
        System.out.print("Enter here: ");
        double tempChange = inputScanner.nextInt();

        tempChange *= 1.8;
        tempChange += 32;

        System.out.println("It is " + tempChange + " Fahrendheit.");
    }
}