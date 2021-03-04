
public class Area{

      int Area(int l, int b){
          int a=l*b;
          System.out.println("Area of rectangle:"+a);
	  return (a);
      }

      double Area(int r){
          double c=(3.14*r*r);
          System.out.println("Area of circle:"+c);
          return (c);
      }

     public static void main(String[] args) {
          Area obj = new Area();
          obj.Area(5,4);
          obj.Area(5);
      }
}

Output: Area of rectangle:20
        Area of circle:78.5