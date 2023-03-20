package FromStart;

import java.util.Scanner;

public class Pallimdrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a name to check for pallimdrom-:");
		String a=sc.nextLine();
		char[] arr=a.toCharArray();
		boolean Pall=palli(arr);
		System.out.println(Pall);
		
		
		
	}
	public static boolean palli(char[] arr) {
		int f=0;
		int l=arr.length-1;
		while(f<=l) {
			if(arr[f]==arr[l]) {
				f++;
				l--;
			}else {
				return false;
			}
			
		}
		return true;
		
		
	}

}
