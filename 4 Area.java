
import java.util.Scanner;
public class Area {
    Area(int l, int b)
    {
        System.out.println("Area of rectangle is "+(l*b));
    }

    void returnArea(int x, int y)
    {
        int a=x*y;
    }
    public static void main(String[] args) {
    	int l , b;
    	Scanner s=new Scanner(System.in);
    	System.out.print("Length:");
        l = s.nextInt();
        System.out.print("Breadth:");
        b = s.nextInt();
        Area ar = new Area(l,b);
    }
}

Output: Length:4
        Breadth:6
        Area of rectangle is 24