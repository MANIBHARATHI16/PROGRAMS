package dem;
import java.util.*;

public class one {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      double c;
    double a=sc.nextInt();
    double b=sc.nextInt();
    if(a<=1000&&a>=1&&b>1&&b<=1000) {
      c=a+b;
      System.out.printf("%.0f",c);
      c=a-b;
      System.out.printf("\n%.0f",c);
      c=a*b;
      System.out.printf("\n%.0f",c);
      double d=a/b;
      System.out.printf("\n%.16f",d);
      c=a%b;
      System.out.printf("\n%.0f",c);
  }}
}
