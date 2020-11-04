import java.util.*;
public class Triangular
    {
    public static int tri(int n)
    {
        if (n == 1)
        {
            System.out.println("*");
            return 1;
        }
        else
        {
            int tri = tri(n-1) + n;
            for (int i = 0; i<=n; i++)
            {
                System.out.print("*");
            } 
            System.out.println("");
            return tri;
        }
    }
    public static void main (String args[])
    { 
        Scanner input = new Scanner(System.in);
        System.out.print("Which term of the triangular sequence to calculate? ");
        int t = input.nextInt();
        System.out.println( t + "th term = " + tri(t) );
    }
    }