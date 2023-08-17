package demo;
import java.util.*;
public class hAARy {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isUpperCase(ch)) {
				s+=Character.toLowerCase(ch);
			}
			else {
				s+=Character.toUpperCase(ch);
			}
		}
		System.out.println(s);
	}

}
