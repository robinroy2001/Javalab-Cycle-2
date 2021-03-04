class number{
	void num(int n) {
		int s=0,k,t;
		k=n;
		while(n>0) {
			t=n%10;
			s=(s*10)+t;
			n=n/10;
		}
		if(s==k)
			System.out.println("The number is palyndrome");
		else
			System.out.println("The number is not palyndrome");
	}
}
public class Palyndrome {
       public static void main(String[] args) {
    	   number obj=new number();
    	   obj.num(1221);
       }
}
