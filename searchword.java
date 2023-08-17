package demo;
import java.util.*;
public class searchword {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     String s=sc.nextLine();
     String s1=sc.nextLine();
     String[] str=
    		 s.split(" ");
    		 int count=0;
     for(int i=0;i<str.length;i++) {
    	 if(str[i].equals(s1)) {
    		 System.out.println("true");
    		 count++;
    		 break;
    	 }}
    	if(count==0) {
    		 System.out.println("false");
    	 }
     
     }
  }


