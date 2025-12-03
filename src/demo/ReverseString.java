package demo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name ");
		String name=sc.nextLine();
		
		
		String revName="";
		
		for(int i=name.length()-1;i>=0;i--) {
		
			revName=revName+name.charAt(i);
		}
		
		System.out.println(revName);
	}

}
