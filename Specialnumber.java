package dem;
import java.util.*;
public class Specialnumber {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int n=sc.nextInt();
      int sum=0;
      int temp=n;
      while(n!=0) {
    	  int fact=1;
    	  int rem=n%10;
    	  for(int i=1;i<=rem;i++) {
    		  fact=fact*i;
    	  }
    		  sum=fact+sum;
    	  
    	  n/=10;
      }
     if(sum==temp) {
    	 System.out.println("Special Number");
     }
     else {
    	 System.out.println("Not a Special Number");
     }
    }}
//Special Number =145=1!+4!+5!.