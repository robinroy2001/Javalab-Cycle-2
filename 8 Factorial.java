class number{
	void num(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		System.out.println("The factorial of "+n+" is "+f);
	}
}
public class Factorial {
	public static void main(String[] args) {
		number obj= new number();
		obj.num(10);
	}

}
