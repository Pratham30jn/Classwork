package FromStart;

public class RecursionArray {
	public static void main(String[] args) {
		
		int[] ary= {1,2,3,4,5};
		print(ary,0);
	}

	public static void print(int[] arr,int index) {
		if(index>arr.length-1) {
			return;
		}
		System.out.println(arr[index]);
		print(arr,index+1);
		
		/*
		 * print(arr,index+1); System.out.println(arr[index]);
		 */	}
}
