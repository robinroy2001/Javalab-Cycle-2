class fact{
	void number(int n) {
		int m;
		System.out.println("The factors of "+n+" are:");
		for(int i=1;i<=n;i++) {
			m=n%i;
			if(m==0)
				System.out.println(i);
		}
	}
}
public class Factor {
	public static void main(String[] args) {
		fact obj=new fact();
		obj.number(12);
	}

}
