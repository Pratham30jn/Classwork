package FromStart;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number-:");
		int x=sc.nextInt();
		int a=1;
		for(int i=1;i<=x;i++) {
			a=i*a;
		}
		System.out.println(a);
	}


}
