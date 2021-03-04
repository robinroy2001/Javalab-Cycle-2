

public class Triangle {
    Triangle()
    {
        System.out.println("Perimeter of triangle is "+perimeter(3, 4, 5));
        System.out.println("Area of triangle is "+area(3, 4, 5));
    }

    int perimeter(int x,int y , int z)
    {
        return (x + y + z);
    }

    int area(int x, int y, int z)
    {
        return (int) (0.5 * 3 * 4);
    }
    public static void main(String[] args) {
        Triangle obj = new Triangle();
     }
}

Output:	Perimeter of triangle is 12
        Area of triangle is 6