import java.util.Random;
public class Montyboyyyyy
{
    public static void main(String[]args)
    {
        Random rand = new Random();
        int opStrat1 = 0;
        int opStrat2 = 0;
        for(int i=0; i<1000; i++)
        {
            boolean door1 = false;
            boolean door2 = false;
            boolean door3 = false;
            int car = rand.nextInt(3)+1;
            if (car == 1)
                door1=true;
            else if (car == 2)
                door2=true;
            else
                door3=true;
            int userPick = rand.nextInt(3)+1;
            boolean userDoor=true;
            int hostPick = rand.nextInt(3)+1;
            while (userDoor)
            {
                if (hostPick==userPick||hostPick==car)
                    hostPick=rand.nextInt(3)+1;
                else
                    userDoor=false;
            }
            if (userPick==car)
                opStrat1++;
            else
                opStrat2++;
        }
        System.out.println(opStrat1+" "+opStrat2);
    }
}