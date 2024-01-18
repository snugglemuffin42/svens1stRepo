import java.util.Scanner;
import java.util.Random;

class yesNoGen
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("how many rows do you want: ");
        int row = scanner.nextInt();

        System.out.println("how many columns do you want: ");
        int col = scanner.nextInt();

        System.out.print("\n ");

        int[][] toDeeArray = new int[row][col];

        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                toDeeArray[i][j] = rand.nextInt(1000);
            }
        }

        for (int i = 0; i < row; i++) 
        {
            for (int j = 0; j < col; j++) 
            {
                System.out.print(toDeeArray[i][j] + " ");
            }
            System.out.print("\n ");
        }

        System.out.print("\n ");

        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                boolean squares = squares(toDeeArray[i][j]);
                System.out.print((squares ? "Yes" : "No") + " ");
            }      
            System.out.print("\n ");
        }

    }
        public static boolean squares(int num)
        {
            int sqrt = (int) Math.sqrt(num);
            return sqrt * sqrt == num;
        }
}