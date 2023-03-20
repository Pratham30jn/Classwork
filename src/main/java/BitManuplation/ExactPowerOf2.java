package BitManuplation;

import java.util.Scanner;

public class ExactPowerOf2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number-:");
		int x=sc.nextInt();
		int a=x& x-1;
		if(a==0) {
			System.out.println("Exact power of 2");
		}else
		System.out.println("Not a exact power");
		
	}

}
