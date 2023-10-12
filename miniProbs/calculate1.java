import java.util.Scanner;
class calculate
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Jeremy is thirsty, but only has 3 bottles of dish soap :(");
        System.out.println("He was looking forward to making a dish soap/paint thinner cocktail, but he can't.");
        System.out.print("How much cans of paint thinner would you like to provide Jeremy: ");
        int paintThin = inputScanner.nextInt();

        paintThin += 3;

        System.out.println("Jeremy has " + paintThin + " servings.");
    }
}