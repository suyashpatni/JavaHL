import java.util.Scanner;
 
public class recPower
{
    public static double power(int base, int exponent)
    {
        if( exponent == 0 )
            { 
               return 1;
            }
        else if( exponent == 1)
            { 
                return base;
            }
        else if( exponent < 0)
        {
                return 1/power(base, exponent*-1);
        }
        else
            { 
                return base*power(base, exponent-1);
            }
    }

    

    public static void main(String[] args)
    { 
        Scanner input = new Scanner(System.in);
        System.out.print("Base = ");
        int x = input.nextInt();
        System.out.print("Exponent = ");
        int y = input.nextInt();
        System.out.println( "\n"+x+" ^ "+y+" = "+power(x,y) );
    }
}