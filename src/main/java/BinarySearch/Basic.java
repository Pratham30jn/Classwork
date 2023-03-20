package BinarySearch;

public class Basic {
	// Basic concept of Binary Search(Two pinter approach). 
	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6,7,8};
		// Check array should be sorted.
		int f=0;
		int l=arr1.length-1;	
		// Element to be searched.
		int n=4;
		for(int i=0;i<arr1.length;i++) {
			int mid =l+f/2;
			if(arr1[mid]==n) {
				System.out.println("Index at whcih element to be searched is present-:"+ mid);
				return;
			}else {
				if (n>arr1[mid]) {
					f=mid+1;
				}else {
					l=mid-1;
				}
			}
			
		}
		
	}

}
