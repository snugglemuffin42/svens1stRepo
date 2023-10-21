import java.util.Random;
class coinFlip
{
    public static void main(String args[]) 
    {
        Random random = new Random();

        int flipResult = random.nextInt(2);

        if (flipResult == 0)
        {
            System.out.println("Heads");
        }
        else
        {
            System.out.println("Tails");
        }
    }
}