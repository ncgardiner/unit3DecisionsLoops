import java.util.Scanner;
public class FindMaxAndMin
{
    public static double findMax()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a series of numbers or any character to quit. ");
        
        double largest = scan.nextDouble();
        while (scan.hasNextDouble())
        {
            double input = scan.nextDouble();
            if(input>largest)
                largest = input;
        }
        return largest;
    }
    public static double findMin()
    {
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Enter a series of numbers or any character to quit. ");
        
        double smallest = scan2.nextDouble();
        while (scan2.hasNextDouble())
        {
            double input = scan2.nextDouble();
            if (input<smallest)
                smallest = input;
        }
        return smallest;
    }
    }
