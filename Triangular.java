import java.util.*;
public class Triangular
    {
    public static int tri(int n)
    {
        if (n == 1)
        {
            return 1;
        }
        else
        {
            return tri(n-1) + n;
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