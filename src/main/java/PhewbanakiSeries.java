import java.util.Scanner;

public class PhewbanakiSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter lenght of array upto which series should continue-:");
		int len =sc.nextInt();
		int [] arr=new int [len];
		arr[1]=1;
        for(int i=2;i<arr.length;i++) {
        	arr[i]=arr[i-1]+arr[i-2];
        }System.out.println("Series-:");
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
		
	
		
		
	}

}
