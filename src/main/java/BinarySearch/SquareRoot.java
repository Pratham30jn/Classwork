package BinarySearch;

import java.util.Scanner;

public class SquareRoot {
	//  Square root of perfect square number.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a  number-:");
		int num=sc.nextInt();
		int f=0;
		int l=num;
		for(int i=0;i<num;i++) {
			int mid =l+f/2;
			if(mid*mid==num) {
				System.out.println("Sq root of num-:"+ mid);
				return;
			}else {
				if(num<mid*mid) {
					l=mid-1;
				} else {
					f=mid+1;
				}
				
			}
		}
		
	}

}
