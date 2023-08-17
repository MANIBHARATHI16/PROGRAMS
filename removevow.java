package demo;
import java.util.*;
public class removevow {
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		String s1=str.replaceAll("[aeiouAEIOU]","");
		System.out.println(s1);
	}
}
