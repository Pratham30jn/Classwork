package BitMan;

import java.util.Scanner;

public class GetBit {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number to get a Bit-:");
	    int x=sc.nextInt();
	    System.out.println(" ith BIt to be get-:");
	    int i=sc.nextInt();
	    int s=(x&(1<<i-1));
	    String bin=Integer.toBinaryString(s);
	    System.out.println("Bit is-:");
	    System.out.println(bin);
	}

}

