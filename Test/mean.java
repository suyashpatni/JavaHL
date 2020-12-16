import java.util.Scanner;

public class mean
{
    static int prime(int num)
    {
        int prime = 1;
        for (int i = 2; i<num/2+1; i++)
        {
            int n = num%i;
            if (n == 0)
            {
                prime = 0;
                break;
            }
        }
        return prime;
    }
    
    static void mean()
    {
        Scanner input = new Scanner(System.in);

        double sum = 0;
        double min = Double.POSITIVE_INFINITY;
        double max = 0;
        double c = 0;
        int prime = 0;

        System.out.print("Enter number: ");
        int num = input.nextInt();
        while (num > 0)
        {
            sum += num;

            if (num<min) min = num;
            if (num>max) max = num;
            if (prime(num) == 1) prime++;

            System.out.print("\nEnter number: ");
            num = input.nextInt();

            c++;
        }

        double average = sum/c*1000;
        double a = (int) (average);
        average = a/1000;
        double range = max - min;

        System.out.println("Maximum: "+max+" Minimum: "+min);
        System.out.println("Range: "+range);
        System.out.println("Average: "+average);
        System.out.println("Prime frequency: "+prime);
    }
    
    public static void main(String[] args)
    {
        System.out.println("Suyash Patni");
        mean();
    }
}