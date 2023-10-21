import java.util.Scanner;
class gradeCalc
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter thy grade:");
        int userGrade = inputScanner.nextInt();

        if(userGrade < 59)
        {
            System.out.println("You are failing (F)");
        }
        else if(userGrade < 69)
        {
            System.out.println("You got a D");
        }
        else if(userGrade < 79)
        {
            System.out.println("You got a C");
        }
        else if(userGrade < 89)
        {
            System.out.println("You got a B");
        }
        else
        {
            System.out.println("You got a A");
        }
    }
}