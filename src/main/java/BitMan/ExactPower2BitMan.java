package BitMan;

import java.util.Scanner;

public class ExactPower2BitMan {
	// to wheater the input exact power of 2 or not.
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check-:");
		int x=sc.nextInt();
		int a=x& x-1;
		if(a==0) {
			System.out.println("Exact power of 2");
			
		}
		else {
			System.out.println("Not exact power");
		}
			
		
		
	}

}
