package demo;

public class SwipeTwoNumberWithoutTemp {

	
	public static void main(String[] args) {
		
		int a=10 , b=20;
		System.out.println("Before Swapping two number "+a+" and "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping two number "+a+" and "+b);
	}
}
