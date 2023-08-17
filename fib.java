package demo;
import java.util.*;
public class fib {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter count");
		int n1=0,n2=1,n3,count=sc.nextInt();
		System.out.print(n1+" "+n2);
		for(int i=0;i<count;i++) {
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
					
		}}}
