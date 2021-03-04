class number{
	void num(int n) {

		for(int i=2;i<n;i++) {
			if(n%i==0) 
				System.out.println("The number is not prime");
			else
				System.out.println("The number is prime");
		
	}
			
	}
}
public class Prime {
	public static void main(String[] args) {
		number obj= new number();
		obj.num(10);
	}

}
