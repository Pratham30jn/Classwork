package FromStart;

import java.util.Scanner;

public class RecursnPower {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number-: ");
		int n=sc.nextInt();
		int two=findPower(n);
		System.out.println(two);
	}
     private static int findPower(int x) {
	if(x<1) {
		return 1;
	}if(x==1) {
		return 2;
	}return 2*findPower(x-1);
}

}
