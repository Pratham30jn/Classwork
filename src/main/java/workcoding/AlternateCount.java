package workcoding;

import java.util.Scanner;

public class AlternateCount {
 public static void main( String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your number-:");
	int x=sc.nextInt();
	System.out.println("Alternate count from 0 to "+x+" is -:");
	
	int i = 0;
	while ( i<=x ) {
		System.out.println(i);
		i=i+2;
	}
	
}
}
