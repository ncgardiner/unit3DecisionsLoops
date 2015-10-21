import java.util.Scanner;
public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      
      System.out.print("\nInput the x coorinate of the first circle: ");
      double xcenter1 = in.nextDouble();
      System.out.print("Input the y coorinate of the first circle: ");
      double ycenter1 = in.nextDouble();
      
      System.out.print("\nInput the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      
      System.out.print("\nInput the x coorinate of the second circle: ");
      double xcenter2 = in.nextDouble();
      System.out.print("Input the y coorinate of the second circle: ");
      double ycenter2 = in.nextDouble();
      
      double distance = Math.pow(Math.pow((xcenter1 - xcenter2),2)+ Math.pow((ycenter1 - ycenter2),2),.5);
      if (radius1 + radius2 < distance)
      {
          System.out.println("\nThe Circles are disjointed");
      }
      else if (radius1 - distance > radius2 || radius2 - distance > radius1)
      {
          System.out.println("\nA cirlce is mutually contained");
      }
      else
      {
          System.out.println("\nThe circles are overlapping");
      }
   }
}