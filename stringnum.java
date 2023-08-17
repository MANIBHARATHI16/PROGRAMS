package demo;
import java.util.*;
public class stringnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String s = sc.nextLine();
        
        String[] words = s.split("\\s");
        int[] integers = new int[words.length];
        
        int index = 0; 
        
        for (String word : words) {
            if (word.matches("\\d+")) {
                integers[index] = Integer.parseInt(word);
                index++;
            }
        }
        
        int highestInteger = Integer.MIN_VALUE;
        for (int i = 0; i < index; i++) {
            if (integers[i] > highestInteger) {
                highestInteger = integers[i];
            }
        }
        
        if (highestInteger != Integer.MIN_VALUE) {
            System.out.println("The highest integer is: " + highestInteger);
        } else {
            System.out.println("No integers found in the input.");
        }
    }
}

//India gets independence in 1947 august 15.
//This program helps to finds the largest number in the given String.