package FromStart;

import java.util.Scanner;

public class RecusionString {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string-:");
	String a=sc.nextLine();
	char[] arr=a.toCharArray();
	reversString(arr,0);
}
  private static void reversString(char []arr, int i) {
	  if(i>arr.length-1) {
		  return;
	  }
	  reversString(arr,i+1);
	  System.out.print(arr[i]);
  }
}
