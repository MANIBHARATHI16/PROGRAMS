package demo;
import java.util.*;
public class lowwom {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s=sc.nextLine();
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]>='A'&&ch[i]<='Z') {
				ch[i]=(char)((int)ch[i]+32);
			}
		}
		for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		
	}

}
