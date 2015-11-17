import java.util.Scanner;

public class temp
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner( System.in );
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();
        int lines = (input*2)-1;
        for (int i = 0; i <= lines; i++)
        {
            int spaces = lines-i;
            int asterisks = (i*2)+1;
            if (i<=input)
            {
                for (int n = 0; n < spaces; n++)
                {
                    System.out.print(" ");
                }
                for (int x = 0; x < asterisks; x++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            else
            {
                for (int n = lines; n > spaces; n--)
                {
                    System.out.print(" ");
                }
                for (int x = lines; x > asterisks; x--)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }
    }
}
