package demo;
import java.util.Scanner;
public class lowstr {
	public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        if(s.equals(s.toLowerCase())){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}
