import java.util.Scanner;

class twoDMatrix
{
    public static void main(String args[])
    {
            int[][] matrix = 
        {
            {-2, 4},
            {6, -8}
        };
    
        System.out.print("starting matix\n ");
        printMatrix(matrix);

        for(int i = 0; i < matrix.length; i++)
        {
            for(int j = 0; j < matrix[i].length; j++)
            {
                matrix[i][j] = Math.abs(matrix[i][j]);
            }
        }

        System.out.print("altered matrix\n ");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix)
    {
        for(int[] r : matrix)
        {
            for(int number : r)
            {
                System.out.print(number + " ");
            }
            System.out.print("\n");
        }
    }
}