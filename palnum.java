package demo;
import java.util.*;
public class palnum {
	public static void main(String[] args) {
	int r=0,temp,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
 temp=n;
 while(n>0) {
 r=n%10;
 sum=(sum*10)+r;
 n=n/10;
 }
 if(temp==sum) {
	 System.out.println("palindrome Number");
 }
 else
	 System.out.println("Not Palindrome");
}}
