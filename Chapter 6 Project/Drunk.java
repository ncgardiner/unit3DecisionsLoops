import java.util.Random;
import java.util.Scanner;
public class Drunk
{
    public static void main(String[]args)
    {
        int x = 0;
        int y = 0;
        int n;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Drunk man starting position: (0,0)");
        System.out.print("Enter the number of blocks to travel: ");
        int z = scan.nextInt();
        for (int i = 0; i<z; i++)
        {
            n = rand.nextInt(4);
            if (n==0)
                x++;
            else if (n==1)
                x--;
            else if (n==2)
                y++;
            else
                y--;
            System.out.println("Drunk man after "+(i+1)+" blocks: ("+x+","+y+")");
        }
    }
}