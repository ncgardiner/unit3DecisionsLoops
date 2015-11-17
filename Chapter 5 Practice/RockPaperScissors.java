import java.util.Scanner;
public class RockPaperScissors
{
     public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose rock, scissors, or paper:");
        String player1 = scan.next().toLowerCase();
        System.out.println("Player 2: Choose rock, scissors, or paper:");
        String player2 = scan.next().toLowerCase(); 
        if (player1.equals("rock"))
        {
            if (player2.equals("paper"))
            {
                System.out.println("Player 2 Wins");
            }
            if (player2.equals("rock"))
            {
                System.out.println("Tie");
            }
            if (player2.equals("scissors"))
            {
                System.out.println("Player 1 Wins");
            }
        }
        if (player1.equals("paper"))
        {
            if (player2.equals("paper"))
            {
                System.out.println("Tie");
            }
            if (player2.equals("rock"))
            {
                System.out.println("Player 1 Wins");
            }
            if (player2.equals("scissors"))
            {
                System.out.println("Player 2 Wins");
            }
        }
        if (player1.equals("scissors"))
        {
            if (player2.equals("paper"))
            {
                System.out.println("Player 1 Wins");
            }
            if (player2.equals("rock"))
            {
                System.out.println("Player 2 Wins");
            }
            if (player2.equals("scissors"))
            {
                System.out.println("Tie");
            }
        }
    }
}