import java.util.Scanner;

/**
 * Demonstrates the use of nested while loops.
 * 
 * @author Lewis/Loftus/Cocking
 */
public class PalindromeTester
{
    /**
     * Tests strings to see if they are palindromes.
     *
     */
   public static void main (String[] args)
   {
      String str, another = "y";
      String newstr;
      int left, right;
      Scanner s = new Scanner(System.in);

      while (another.equalsIgnoreCase("y")) // allows y or Y
      {
         System.out.println ("Enter a potential palindrome (No punctuation other than periods)");
         str = s.nextLine();
         newstr = str.replace(".", "");
         newstr = newstr.replace(" ", "");

         left = 0;
         right = newstr.length() - 1;

         while (newstr.charAt(left) == newstr.charAt(right) && left < right)
         {
            left++;
            right--;
         }

         System.out.println();

         if (left < right)
            System.out.println ("That string is NOT a palindrome.");
         else
            System.out.println ("That string IS a palindrome.");

         System.out.println();
         System.out.print ("Test another palindrome (y/n)? ");
         another = s.nextLine();
      }
   }
}
