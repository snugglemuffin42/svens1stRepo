import java.util.Scanner;
class stringRev
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("how much numers shall be enterd");
        System.out.println("(enter number only,nothing crazy too)");
        System.out.println("Enter: ");

        int userNumb = scanner.nextInt();
        int daBiggy = 0;
        int daSmally = 99999;

        while (userNumb > 0) 
        {
            System.out.println("enter thou number " + userNumb + " remaining.");
            
            int newNum = scanner.nextInt();

            userNumb--;

            if(daBiggy < newNum)
            {
                daBiggy = newNum;
            }
            if(daSmally >= newNum)
            {
                daSmally = newNum;
            }
        }
            System.out.println("da smalles numer is: " + daSmally);
            System.out.println("da bigges numer is: " + daBiggy);
    }
}