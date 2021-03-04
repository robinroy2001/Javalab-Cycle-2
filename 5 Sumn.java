class num{
	 num(int n){
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum="+sum);
	}
}
public class Sumn {
    public static void main(String[] args) {
    	num obj=new num(1000);
    	
    }
}
