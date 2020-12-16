import java.util.Scanner;

public class mult
{

    static int fib(int num)
    {
        if (num == 0)
        {
            return 0;
        }
        else if (num == 1)
        {
            return 1;
        }
        else
        {
            return fib(num-1) + fib(num-2);
        }

    }

    static void mult()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 9: ");
        int num = input.nextInt();
        while (num != 0)
        {
            while (num < 0 || num > 9)
            {
                System.out.print("Error - Enter an integer between 1 and 9: ");
                num = input.nextInt();
            }
            for (int n = 1; n <= num; n++)
            {
                for (int i = 1; i <= 20; i++)
                {
                    int mult = n * i; 
                    System.out.print(n+" x");

                    int leni = String.valueOf(i).length();
                    int lenmult = String.valueOf(mult).length();

                    for (int a = 0; a < 3 - leni; a++)
                    {
                        System.out.print(" ");
                    }
                    System.out.print(i + " =");
                    
                    for (int a = 0; a < 4 - lenmult; a++)
                    {
                        System.out.print(" ");
                    }
                    System.out.println(mult);
                }

                System.out.println("------------");
            }
            System.out.print("Enter an integer between 1 and 9: ");
            num = input.nextInt();
        }
    }  

    public static void main(String[] args)
    {
        System.out.println("Suyash Patni");
        //mult();
        System.out.println(fib(10));
    }
}