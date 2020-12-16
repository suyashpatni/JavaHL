import java.util.Scanner;

public class fibASSESSMENT 

{
    static long fib(int num)
    {
        long n0 = 0;
        long n1 = 1;
        long sum = 0;
        if (num == 0)
        {
            sum = 0;
        }
        else if (num == 1)
        {
            sum = 1;
        }
        else
        {
            for (int i = 2; i <= num; i++)
            {
                sum = 0;
                sum += n0+n1;
                n0 = n1;
                n1 = sum;
            }
        }
        return sum;

    }

    static void run()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Calculate upto term (n)? ");
        int num = input.nextInt();
        while (num != 0)
        {

            double sum = 0;
            double c = 0;
            while (num < 0)
            {
                System.out.println("ERROR - enter a positive integer");
                System.out.print("Calculate upto term (n)? ");
                num = input.nextInt();
            }
            
            
            for (int i = 0; i <= num; i++)
            {
                if (num <= 20) System.out.print(fib(i) + "; ");
                sum += fib(i);
                c++;
            }

            if (num > 20) System.out.print("Term "+num+" = "+fib(num));
            

            System.out.println("");
            

            double average = sum/c;

            System.out.println("Average = "+average);

            if (num > 20) System.out.println(fib(num)+" has " + String.valueOf(fib(num)).length() + " digits");

            System.out.println("------------------------------");

            System.out.print("Calculate upto term (n)? ");
            num = input.nextInt();
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Suyash Patni");
        run();
    }
}
