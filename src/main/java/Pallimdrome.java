import java.util.Scanner;

public class Pallimdrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		char[] arr1=a.toCharArray();
		char[] arr2=b.toCharArray();
		
                     String pallin=pallindrome(arr1,arr2);
	System.out.println(pallin);
		
	}
	public static String pallindrome(char[] arr1,char[] arr2) {
		int f=0;
		int l=arr2.length-1;
		if(arr1.length==arr2.length) {
		while(f<arr1.length) {
			if (arr1[f]==arr2[l]) {
				f++;
				l--;
			}else {
				return "NO";
			}
		
		}
		}
            	return "YES";
	}
}