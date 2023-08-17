package demo;
import java.util.*;
public class lastdigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=sc.nextInt(),rem=0;
		while(n>0) {
			rem=n%10;
			System.out.println(rem);
			break;
		}
	}

}
