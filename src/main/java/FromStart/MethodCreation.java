package FromStart;

import java.util.Scanner;

public class MethodCreation {
	
	public static void main( String[] args ) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your numbers for addition-:");
		System.out.println("Number 1-:");
		int x = sc.nextInt();
		System.out.println("Number 2-:");
		int y = sc.nextInt();
		
		
		
		int z = additionOfTwoNumber( x,y );
		
		System.out.println("Adition of two number is-:"+z);
		
		System.out.println("Number 3-:");
		int w= sc.nextInt();
		System.out.println("Number 4-:");
		int t=sc.nextInt();
		
		
		int p = multiplicationOfTwoNumbers( w,t );
		System.out.println("Multiplication of two numbers-:"+p);
		
		
		
		
	}
	
	
	
	public static int additionOfTwoNumber( int x, int y ) {
		int a = x+y;
		return a;
		
	}
	
	public static int multiplicationOfTwoNumbers( int w, int t ) {
		int s = w*t;
		return s;
		
		
		
	}
	
	

}
