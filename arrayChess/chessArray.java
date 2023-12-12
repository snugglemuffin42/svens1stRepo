class chessArray
{
    public static void main(String args[])
    {
        int rowAmt = 8;
        int colAmt = 8;

            System.out.println("Here is a Chess Board using Unicode!");

            String[][] array = new String[rowAmt][colAmt];
        
            array[0][0] = "♜";
            array[0][1] = "♞";
            array[0][2] = "♝";
            array[0][3] = "♛";
            array[0][4] = "♚";
            array[0][5] = "♝";
            array[0][6] = "♞";
            array[0][7] = "♜";

            array[1][0] = "♟";
            array[1][1] = "♟";
            array[1][2] = "♟";
            array[1][3] = "♟";
            array[1][4] = "♟";
            array[1][5] = "♟";
            array[1][6] = "♟";
            array[1][7] = "♟";

            array[2][0] = "■";
            array[2][1] = "□";
            array[2][2] = "■";
            array[2][3] = "□";
            array[2][4] = "■";
            array[2][5] = "□";
            array[2][6] = "■";
            array[2][7] = "□";

            array[3][0] = "□";
            array[3][1] = "■";
            array[3][2] = "□";
            array[3][3] = "■";
            array[3][4] = "□";
            array[3][5] = "■";
            array[3][6] = "□";
            array[3][7] = "■";

            array[4][0] = "■";
            array[4][1] = "□";
            array[4][2] = "■";
            array[4][3] = "□";
            array[4][4] = "■";
            array[4][5] = "□";
            array[4][6] = "■";
            array[4][7] = "□";

            array[5][0] = "□";
            array[5][1] = "■";
            array[5][2] = "□";
            array[5][3] = "■";
            array[5][4] = "□";
            array[5][5] = "■";
            array[5][6] = "□";
            array[5][7] = "■";

            array[6][0] = "♙";
            array[6][1] = "♙";
            array[6][2] = "♙";
            array[6][3] = "♙";
            array[6][4] = "♙";
            array[6][5] = "♙";
            array[6][6] = "♙";
            array[6][7] = "♙";

            array[7][0] = "♖";
            array[7][1] = "♘";
            array[7][2] = "♗";
            array[7][3] = "♕";
            array[7][4] = "♔";
            array[7][5] = "♗";
            array[7][6] = "♘";
            array[7][7] = "♖";

            for(int r = 0; r < rowAmt; r++)
            {
                for(int c = 0; c < colAmt; c++)
                {
                    System.out.print(array[r][c] + " ");
                }
                System.out.println();
            }
    }
}