package workcoding;

import java.util.Scanner;

public class Counting {
	
	
	public static void main( String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr your number-:");
		int x=sc.nextInt();
		System.out.println("Counting from o to "+x+" is-:");
		int z=0;
		while(z<=x) {
			
			System.out.println(z);
			z++;
			
		}
		
		
	}

}
