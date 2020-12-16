import java.util.concurrent.TimeUnit;

public class RecursiveCircles {

    static void drawInOut(int n, double x, double y, double size, int num) throws InterruptedException
    {
        StdDraw.setPenColor(n*5, 0, -5*n+255);
        double c = 0.005;
        double k = (size/c) - num;

        if (n == 0) return;

        TimeUnit.MILLISECONDS.sleep(100);

        if (size - c*(n+k)>0) 
        StdDraw.circle(x, y, size - c*(n+k));

        drawInOut(n-1, x, y, size, num);
    }

    static void drawOutIn(int n, double x, double y, double size, int num) throws InterruptedException
    {

        double c = 0.005;
        double k = (size/c) - num;

        if (n == 0) return;

        drawOutIn(n-1, x, y, size, num);

        StdDraw.setPenColor(n*5, -5*n+255, 0);

        if (size - c*(n+k)>0) 
        StdDraw.circle(x, y, size - c*(n+k));

        TimeUnit.MILLISECONDS.sleep(100);
        
    }
    
    public static void main(String[] args) throws InterruptedException
    {
        
        while (true)
        {
            StdDraw.clear(StdDraw.WHITE);
            int N = Integer.parseInt(args[0]);
            double x = 0.5, y = 0.5;   
            double size = 0.5; 
            drawOutIn(N, x, y, size, N);
            StdDraw.clear(StdDraw.WHITE);
            drawInOut(N, x, y, size, N);
        }
                
    }

}
