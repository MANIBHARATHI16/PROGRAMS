package demo;
import java.util.*;
public class prime {
	public static void main(String[] hh) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int count=0;
		if(n==0 || n==1) {
			System.out.println("NOT Prime");
			return;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==1 && count==n) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}
	}