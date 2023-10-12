import java.util.Scanner;
class area
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("You are hallucinating, and see massive cheerios around you, and you are wondering how much space is inside of one of them.");
        System.out.print("You luckily have a tape measure, what is the radius of your cheerio? ");
        int cheero = inputScanner.nextInt();

        double circle = Math.PI * (2 * cheero);

        System.out.println("The area of the cheerio is: " + circle);
    }
}