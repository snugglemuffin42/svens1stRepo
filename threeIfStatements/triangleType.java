import java.util.Scanner;
class triangleType
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter three side lengths for a triangle:");
        int firstSide = inputScanner.nextInt();
        int secondSide = inputScanner.nextInt();
        int thirdSide = inputScanner.nextInt();

        if (firstSide + secondSide + thirdSide == 180)
        {
            if (firstSide == secondSide && secondSide == thirdSide)
            {
            System.out.println("This is a equliateral triangle.");
            }
            else if (firstSide == secondSide || secondSide == thirdSide)
            {
            System.out.println("This is a Isosceles triangle.");
            }
            else
            {
            System.out.println("This is a Scalene triangle.");
            }
        }
        else
        {
            System.out.println("This is not a triangle");
        }
    }
}