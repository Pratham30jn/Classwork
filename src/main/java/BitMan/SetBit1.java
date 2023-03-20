package BitMan;

import java.util.Scanner;

public class SetBit1 {
	//set ith bit .
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number-:");
	    int x=sc.nextInt();
	    String b=Integer.toBinaryString(x);
	    System.out.println("Binary of entered number-:"+b);
	    System.out.println("Bit to be set -:");
	    int i= sc.nextInt();
	    int z=x | 1<<i-1;
	    String str=Integer.toBinaryString(z);
	    if(z==x) {
	    	System.out.println("Bit already set");
	    }else {
		System.out.println("Ith bit is set-:"+str);
	}
	}
}
