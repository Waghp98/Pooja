package Array;

import java.util.Scanner;

public class Programm1 {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char[] ch;
		ch=new char[8];
		System.out.println("Enter value in char format");
		for(int index=0;index<=ch.length;index++)
		{
		ch[index]=scan.next().charAt(0);
			}
		System.out.println(ch[0]);
			
		
	}
}
