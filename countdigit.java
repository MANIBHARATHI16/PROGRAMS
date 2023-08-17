package dem;
import java.util.*;
public class countdigit {
	public static void main(String[]args) {
		System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int number=sc.nextInt();
	int count=0;
	do {
		 number=number/10;
		   count++;
	}
	while(number!=0);
		System.out.println(count);
	
	;
	}}
	


