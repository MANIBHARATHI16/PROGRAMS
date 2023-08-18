package dem;
import java.util.*;
public class Marsnum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		if(n>9) {
		int count=0,sum=0,rem=0;
		while(n>9) {
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
		n=sum;
		sum=0;
		count ++;
		}

		
		if(count%2==0) {
			System.out.println("Mars Number");
		}
		else {
			System.out.println("Not a Mars Number");
		}
		}
		else {
			System.out.println("Not a Mars Number");
		}
		
	}

}
