import java.util.Scanner;
public class LeapYear
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a year you loser: ");
        int year = in.nextInt();
        if (year<=1582 && (year%4)==0)
        {
            System.out.println("It's a leap year my boy! ");
        }
        else if ( (year%4)== 0 &&(year%100) !=0 || (year%400) == 0  )
        {
            System.out.println("It is a leap year my boy! ");
        }
        else
        {
            System.out.println("It's not a leap year my boy! ");
        }
    }
}