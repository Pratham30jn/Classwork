package BitManuplation;

import java.util.Scanner;

public class GetIthBit {
	public static void main(String[] args) {
	   Scanner sc=new Scanner (System.in);
	   System.out.println("Enter a number-:");
	   int numb=sc.nextInt();
	   System.out.println("Enter which bit you want know in a entered number-:");
	   int x=sc.nextInt();
	   int s=numb&1<<x-1;
	   if(s==0) {
		   System.out.println(x+" bit is 0");
	   }else {
		   System.out.println(x+ " bit is 1");
	   }
	}

}
