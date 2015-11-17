import java.util.Scanner;
public class PromptUntilMatch
{
    public static double promptUntilMatch()
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        double input;
        
        do
        {
            System.out.print("Please enter a positive value < 100: ");
            input = scan.nextDouble();
            if (input>0 && input <100)
                valid = true;
        }
        while (!valid);
        return input;
    }
}