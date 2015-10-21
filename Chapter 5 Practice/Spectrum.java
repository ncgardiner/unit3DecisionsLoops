import java.util.Scanner;
public class Spectrum
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the wavelength in the second format (7x10^14 = 7e14) : ");
        double wavelength = in.nextDouble();
        String waves = "";
        if (wavelength>1e-1)
        {
            waves = "Radio Waves";
        }
        else if (wavelength>1e-3)
        {
            waves = "Micro Waves";
        }
        else if (wavelength>7e-7)
        {
            waves = "Infrared";
        }
        else if (wavelength>4e-7)
        {
            waves = "Visible Light";
        }
        else if (wavelength>1e-8)
        {
            waves = "Ultra Violet";
        }
        else if (wavelength>1e-11)
        {
            waves = "X-rays";
        }
        else
        {
            waves = "Gamma Rays";
        }
        System.out.println("\n"+waves);
    }
}