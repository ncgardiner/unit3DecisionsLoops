import java.util.Scanner;
public class Epslion 
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a floating point number ");
        double i = in.nextDouble();
        final double EPSILON = 1e-14;
        String adj = "";
        if (Math.abs(i)<1.0)
        {
            adj = "small";
        }
        else if (Math.abs(i) >10000)
        {
            adj = "large";
        }
        if (Math.abs(i) <EPSILON)
        {
            System.out.println("It's a zero.");
        }
        else if (i>0)
        {
            System.out.println("The number is a "+adj+" positive number.");
        }
        else
        {
            System.out.println("The number is a "+adj+" negative number.");
        }
    }
}