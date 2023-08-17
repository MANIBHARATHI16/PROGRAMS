package demo;
import java.util.*;
public class vowcon {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		s=s.toLowerCase();
		int v=0,c=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				v++;
			}
			else {
				c++;
			}
		}
		System.out.println(v);
		System.out.println(c);
	}

}
