package Hashing;

public class FrequencyChar {
	public static void main(String[] args) {
		String a="absbsbcdbdbdthjklmn";
		char[] arr=a.toCharArray();
		int [] arr1=new int[100];
		for(int i=0;i<arr.length;i++) {
			arr1[arr[i]-97]++;
		}
		
	}

}
