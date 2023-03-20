package workcoding;

import java.util.Scanner;

public class TwoFiveTable {
	
	public static void main( String[] args ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number-:");
		
		
	int x= sc.nextInt();
	System.out.println("Table upto the number-:");
	int z=sc.nextInt();
	
	int count=1;
	System.out.println("Table of the number "+x+" is-: ");
	while(count<=z) {
		
		System.out.println(x+"*"+count+ "="+ x*count);
		count++;
		
	}
		
		
	}
	
	
	

}
