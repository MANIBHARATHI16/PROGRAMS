package demo;
import java.util.*;
public class occurancechar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String d=sc.nextLine();
		System.out.println("Enter the char");
		char c=sc.next().charAt(0);
		char[] ch=d.toCharArray();	 
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]==c)) {
				System.out.print(ch[i]);
			}
		}
				}

}
