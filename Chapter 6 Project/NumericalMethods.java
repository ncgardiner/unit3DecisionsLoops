import java.util.Scanner;
public class NumericalMethods
{
     public static void main(String[] args)
     {
         int fold1=0;
         int fold2=1;
         int foldn=fold1+fold2;
         System.out.print("Enter the number to equal n in the Fibonacci sequence: ");
         Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         for (int i=0; i<n; i++)
         {
             System.out.println(fold1);
             fold2 = fold1;
             fold1 = foldn;
             foldn = fold1+fold2;
         }
         
     }
     public static void main2(String[]args)
     {
         
         
     }
}