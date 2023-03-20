package BitMan;

import java.util.Scanner;
// Number of bit's set in a number.

public class NumberOfBitSet {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number-:");
		int n=sc.nextInt(); 
		
         int count=0;
         int i=0;
        while(n>0) {
        	count+= n&1;
       	n >>=1;
        i++;
        
        }//System.out.println("Bit set in entered number is ="+count);
if(count==1) {
         System.out.println("Postion of the set bit is-:"+i);
	}else {
		System.out.println("-1");
	}
}
}
