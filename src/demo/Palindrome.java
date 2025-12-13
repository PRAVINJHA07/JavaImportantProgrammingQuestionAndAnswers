package demo;

public class Palindrome {

	public static void main(String[] args) {

		String name="MADAM";
		
		name=name.toLowerCase();
		String rev="";
		
		for(int i=name.length()-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		
		System.out.println(rev.equals("madam") ? "Palindrome" : "Not Palindrome");
		
	}

	
}
