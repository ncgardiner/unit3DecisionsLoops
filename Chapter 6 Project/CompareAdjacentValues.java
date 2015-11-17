import java.util.Scanner;
public class CompareAdjacentValues
{
    public static void detectAdjacentDuplicateValues()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers and a character to quit. ");
        
        double input = scan.nextDouble();
        while(scan.hasNextDouble())
        {
            double previousInput = input;
            input = scan.nextDouble();
            if (previousInput==input)
            {
                System.out.println("They are the same my boy! ");
            }
        }
    }
}