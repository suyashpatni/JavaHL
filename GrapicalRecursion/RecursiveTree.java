public class RecursiveTree
{
    static void drawH(double x, double y, double size)
    {
        StdDraw.line(x + size, y, x - size, y);
        StdDraw.line(x + size, y + size, x + size, y - size);
        StdDraw.line(x - size, y + size, x - size, y - size);
    }

    static void draw(int n, double x, double y, double size)
    {
        if (n == 0) return;

        drawH(x, y, size);
        double ratio = 2;
        draw(n-1,x + size, y + size, size/ratio);
        draw(n-1,x - size, y + size, size/ratio);
        draw(n-1,x + size, y - size, size/ratio);
        draw(n-1,x - size, y - size, size/ratio);
    }

    public static void main(String[] args)
    {
        int N = Integer.parseInt(args[0]);

        draw(N, 0.5, 0.5, 0.25);
    }
}