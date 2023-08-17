package demo;
import java.util.*;
public class primseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i,j;
		for( i=2;i<=n;i++) {
			int count=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i+" ");
			}
			
		}
		
	}

}

