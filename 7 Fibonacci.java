class test{
	void num(int n) {
		int f=0,s=1,t;
		System.out.println("The first "+n+" fibonacci numbers are:");
		for(int i=0;i<n;i++) {
			System.out.println(f);
			t=f+s;
			f=s;
			s=t;
			
		}
	}
}
public class Fibonacci {
	public static void main(String[] args) {
		test obj=new test();
		obj.num(10);
	}

}
