import java.util.Scanner;
class userAge
{
    public static void main(String args[]) 
    {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("How old are thou?:");
        int userAge = inputScanner.nextInt();

        if(userAge < 0)
        {
            System.out.println("You ain even birth bruh😩");
        }
        else if(userAge <= 12)
        {
            System.out.println("You are a child😭");
        }
        else if(userAge <= 19)
        {
            System.out.println("you a teen🤤");
        }
        else if(userAge <= 59)
        {
            System.out.println("man you gettin olddd🤫 (you are an adult)");
        }
        else if(userAge <= 99)
        {
            System.out.println("you prolly get discounts at dennys senior👹");
        }
        else
        {
            System.out.println("you dead💀");
        }
    }
}